package com.wry.dao;

import static com.wry.dao.PermsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wry.pojo.Perms;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface PermsDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, code, link, parentid, type, status, percode, icon);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Perms> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PermsResult")
    Optional<Perms> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PermsResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="link", property="link", jdbcType=JdbcType.VARCHAR),
        @Result(column="parentid", property="parentid", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="percode", property="percode", jdbcType=JdbcType.VARCHAR),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR)
    })
    List<Perms> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, perms, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, perms, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Perms record) {
        return MyBatis3Utils.insert(this::insert, record, perms, c ->
            c.map(name).toProperty("name")
            .map(code).toProperty("code")
            .map(link).toProperty("link")
            .map(parentid).toProperty("parentid")
            .map(type).toProperty("type")
            .map(status).toProperty("status")
            .map(percode).toProperty("percode")
            .map(icon).toProperty("icon")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Perms record) {
        return MyBatis3Utils.insert(this::insert, record, perms, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(code).toPropertyWhenPresent("code", record::getCode)
            .map(link).toPropertyWhenPresent("link", record::getLink)
            .map(parentid).toPropertyWhenPresent("parentid", record::getParentid)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(percode).toPropertyWhenPresent("percode", record::getPercode)
            .map(icon).toPropertyWhenPresent("icon", record::getIcon)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Perms> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, perms, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Perms> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, perms, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Perms> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, perms, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Perms> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, perms, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Perms record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(code).equalTo(record::getCode)
                .set(link).equalTo(record::getLink)
                .set(parentid).equalTo(record::getParentid)
                .set(type).equalTo(record::getType)
                .set(status).equalTo(record::getStatus)
                .set(percode).equalTo(record::getPercode)
                .set(icon).equalTo(record::getIcon);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Perms record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(code).equalToWhenPresent(record::getCode)
                .set(link).equalToWhenPresent(record::getLink)
                .set(parentid).equalToWhenPresent(record::getParentid)
                .set(type).equalToWhenPresent(record::getType)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(percode).equalToWhenPresent(record::getPercode)
                .set(icon).equalToWhenPresent(record::getIcon);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Perms record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(code).equalTo(record::getCode)
            .set(link).equalTo(record::getLink)
            .set(parentid).equalTo(record::getParentid)
            .set(type).equalTo(record::getType)
            .set(status).equalTo(record::getStatus)
            .set(percode).equalTo(record::getPercode)
            .set(icon).equalTo(record::getIcon)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Perms record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(code).equalToWhenPresent(record::getCode)
            .set(link).equalToWhenPresent(record::getLink)
            .set(parentid).equalToWhenPresent(record::getParentid)
            .set(type).equalToWhenPresent(record::getType)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(percode).equalToWhenPresent(record::getPercode)
            .set(icon).equalToWhenPresent(record::getIcon)
            .where(id, isEqualTo(record::getId))
        );
    }

    //根据用户id获得所有的权限信息
    @Select("select rbac_perms.percode " +
            "from rbac_user_perm" +
            " left join rbac_perms " +
            "on rbac_user_perm.permid=rbac_perms.id where userid=#{userid} and rbac_perms.type='p'")
    List<String> getPermsByUserId(Integer userid);

    //获得对应用户的所有菜单
    @Select("select rbac_perms.* from rbac_user " +
            "left join rbac_user_perm on rbac_user.id=rbac_user_perm.userid " +
            "left join rbac_perms on rbac_user_perm.permid=rbac_perms.id" +
            " where username=#{username} and type='m' and rbac_perms.status='y'")
    List<Perms> findMenu(String username);

    //获得所有的权限
    @Select("select *from rbac_perms where status='y'")
    List<Perms> findPerms();

    //获得指定用户的所有权限
    @Select("SELECT rbac_perms.id FROM rbac_user_perm" +
            " LEFT JOIN rbac_perms on " +
            "rbac_user_perm.permid=rbac_perms.id where status='y' and userid=#{userid}")
    List<Integer> getUserPerms(Integer userid);

    //删除当前用户的所有权限
    @Delete("delete from rbac_user_perm where userid=#{userid}")
    int delUserPerms(Integer userid);

    //批量添加权限
    int saveUserPerms(@Param("ids") List<String> ids,@Param("userid") Integer userid);
}