package com.wry.dao;

import static com.wry.dao.TeacherDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wry.pojo.Teacher;

import java.nio.channels.spi.SelectorProvider;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
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
public interface TeacherDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, education, career, isfamous, avatar, subjectid, status);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Teacher> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("TeacherResult")
    Optional<Teacher> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="TeacherResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="education", property="education", jdbcType=JdbcType.VARCHAR),
        @Result(column="career", property="career", jdbcType=JdbcType.VARCHAR),
        @Result(column="isfamous", property="isfamous", jdbcType=JdbcType.CHAR),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="subjectid", property="subjectid", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.CHAR)
    })
    List<Teacher> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, teacher, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, teacher, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Teacher record) {
        return MyBatis3Utils.insert(this::insert, record, teacher, c ->
            c.map(name).toProperty("name")
            .map(education).toProperty("education")
            .map(career).toProperty("career")
            .map(isfamous).toProperty("isfamous")
            .map(avatar).toProperty("avatar")
            .map(subjectid).toProperty("subjectid")
            .map(status).toProperty("status")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Teacher record) {
        return MyBatis3Utils.insert(this::insert, record, teacher, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(education).toPropertyWhenPresent("education", record::getEducation)
            .map(career).toPropertyWhenPresent("career", record::getCareer)
            .map(isfamous).toPropertyWhenPresent("isfamous", record::getIsfamous)
            .map(avatar).toPropertyWhenPresent("avatar", record::getAvatar)
            .map(subjectid).toPropertyWhenPresent("subjectid", record::getSubjectid)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Teacher> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, teacher, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Teacher> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, teacher, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Teacher> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, teacher, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Teacher> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, teacher, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Teacher record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(education).equalTo(record::getEducation)
                .set(career).equalTo(record::getCareer)
                .set(isfamous).equalTo(record::getIsfamous)
                .set(avatar).equalTo(record::getAvatar)
                .set(subjectid).equalTo(record::getSubjectid)
                .set(status).equalTo(record::getStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Teacher record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(education).equalToWhenPresent(record::getEducation)
                .set(career).equalToWhenPresent(record::getCareer)
                .set(isfamous).equalToWhenPresent(record::getIsfamous)
                .set(avatar).equalToWhenPresent(record::getAvatar)
                .set(subjectid).equalToWhenPresent(record::getSubjectid)
                .set(status).equalToWhenPresent(record::getStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Teacher record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(education).equalTo(record::getEducation)
            .set(career).equalTo(record::getCareer)
            .set(isfamous).equalTo(record::getIsfamous)
            .set(avatar).equalTo(record::getAvatar)
            .set(subjectid).equalTo(record::getSubjectid)
            .set(status).equalTo(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Teacher record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(education).equalToWhenPresent(record::getEducation)
            .set(career).equalToWhenPresent(record::getCareer)
            .set(isfamous).equalToWhenPresent(record::getIsfamous)
            .set(avatar).equalToWhenPresent(record::getAvatar)
            .set(subjectid).equalToWhenPresent(record::getSubjectid)
            .set(status).equalToWhenPresent(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    //讲师列表+条件查询
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("teacher_subject")
    List<Teacher> selectTeacher(SelectStatementProvider provider);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Teacher> queryTeacher(String name){
        String  teachername = null;
        if (name != null && !("".equals(name))){
            teachername="%"+name+"%";
        }
        SelectStatementProvider provider = SqlBuilder
                .select(TeacherDao.selectList)
                .from(teacher)
                .where(TeacherDynamicSqlSupport.name, isLikeWhenPresent(teachername))
                .build().render(RenderingStrategies.MYBATIS3);
        return selectTeacher(provider);
    }

    //根据id查询讲师
    @Select("select *from k15_teacher where id=#{id}")
    Teacher getTeacherById(Integer id);

    //查询所有讲师
    @Select("select *from k15_teacher where status='y'")
    List<Teacher> queryAllTeacher();
}