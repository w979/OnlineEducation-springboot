package com.wry.config;

import com.wry.filter.JwtFilter;
import com.wry.handler.*;
import com.wry.service.impl.LoginDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.annotation.Resource;

/**
 * Spring Security配置类
 */
@EnableWebSecurity  //打开security配置
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启spring security注解支持
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    private JwtFilter jwtFilter;

    @Resource
    private LoginDetailService loginDetailService;

    /**
     * 构造注入 SecurityConfig 到IOC容器  并懒加载
     * @param loginDetailService
     */
    public SecurityConfig(@Lazy LoginDetailService loginDetailService){
        this.loginDetailService=loginDetailService;
    }

    /**
     * 将PasswordEncoder注入到ioc容器 加密方式
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * 处理security的认证
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //调用UserDetailService中的认证结果并赋值给AuthenticationManagerBuilder，做认证和鉴权对比
        auth.userDetailsService(loginDetailService).passwordEncoder(passwordEncoder());
    }

    /**
     * 修改Spring Security默认的过滤器链【重要】
     * 修改security默认的行为
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest()
                .authenticated(); //拦截哪些请求，默认拦截所有


        //登录页面配置
        http.formLogin()
                .successHandler(new LoginSuccessHandler()) //登录成功的处理
                .failureHandler(new LoginFailureHandler()) //登录失败后处理
                .permitAll(); //放行登录相关请求

        //退出成功后的处理器
        http.logout().logoutSuccessHandler(new SimpLogoutSuccessHandler());

        //认证和鉴权异常配置
        http.exceptionHandling()
                .authenticationEntryPoint(new SimpleAuthenticationEntryPoint())//认证异常处理器
                .accessDeniedHandler(new SimpleAccessDeniedHandler());//鉴权异常处理器

        //前后端项目中要禁用掉session
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        //将自定义的jwtFilter添加到Spring Security过滤器链的倒数第二个以前
        http.addFilterAfter(jwtFilter, UsernamePasswordAuthenticationFilter.class);

             http.csrf().disable();
    }
}

