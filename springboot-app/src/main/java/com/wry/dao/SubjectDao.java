package com.wry.dao;

import static com.wry.dao.SubjectDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wry.pojo.Subject;
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
public interface SubjectDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, sort, coursenum);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Subject> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SubjectResult")
    Optional<Subject> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SubjectResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.INTEGER),
        @Result(column="coursenum", property="coursenum", jdbcType=JdbcType.INTEGER)
    })
    List<Subject> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, subject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, subject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Subject record) {
        return MyBatis3Utils.insert(this::insert, record, subject, c ->
            c.map(name).toProperty("name")
            .map(sort).toProperty("sort")
            .map(coursenum).toProperty("coursenum")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Subject record) {
        return MyBatis3Utils.insert(this::insert, record, subject, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(sort).toPropertyWhenPresent("sort", record::getSort)
            .map(coursenum).toPropertyWhenPresent("coursenum", record::getCoursenum)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Subject> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, subject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Subject> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, subject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Subject> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, subject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Subject> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, subject, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Subject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(sort).equalTo(record::getSort)
                .set(coursenum).equalTo(record::getCoursenum);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Subject record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(sort).equalToWhenPresent(record::getSort)
                .set(coursenum).equalToWhenPresent(record::getCoursenum);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Subject record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(sort).equalTo(record::getSort)
            .set(coursenum).equalTo(record::getCoursenum)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Subject record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(sort).equalToWhenPresent(record::getSort)
            .set(coursenum).equalToWhenPresent(record::getCoursenum)
            .where(id, isEqualTo(record::getId))
        );
    }


    //根据id查询科目
    @Select("select *from k15_subject where id=#{id}")
    Subject getSubjectById(Integer id);

    //根据id查询学生选修课程
    @Select("select sub.name from k15_stu_subject ss left join k15_subject sub on ss.subjectid=sub.id where studentid=#{studentid}")
    List<Subject> getSubByUserId(Integer studentid);

    //根据学生id删除对应的学生信息及课程信息
    @Delete("delete from k15_stu_subject where studentid=#{studentid}")
     int delSubStu(Integer studentid);
}