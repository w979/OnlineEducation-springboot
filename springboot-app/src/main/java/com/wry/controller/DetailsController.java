package com.wry.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wry.pojo.Details;
import com.wry.service.IDetailsService;
import com.wry.utils.ResponseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class DetailsController {
    @Resource
    private IDetailsService detailsService;

    /**
     * 查所有记录
     * @return
     */
    @GetMapping("data/list")
    public ResponseResult<Object> getMenu(@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum,
                                          @RequestParam(value = "pageSize",required = false,defaultValue = "7")Integer pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Details> detailsList = detailsService.findAll();
        PageInfo<Details> pageInfo = new PageInfo<>(detailsList);
        return new ResponseResult<>(200, "ok",pageInfo);
    }

    /**
     * 添加数据
     */
    @PostMapping("/data/add")
    public ResponseResult<Object> saveDetails(@RequestBody Details details){
        details.setOperatedate(new Date());
        System.out.println("==>"+details);
        int n = detailsService.saveDetails(details);
        if (n>0){
            return  new ResponseResult<>(200,"ok");
        }else {
            return  new ResponseResult<>(5005,"error");
        }
    }

}
