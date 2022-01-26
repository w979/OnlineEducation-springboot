package com.wry.dao;

import static com.wry.dao.CourseDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wry.pojo.Course;
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
public interface CourseDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, describes, teacherid, pnum, electivedate, subjectid, status);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Course> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CourseResult")
    Optional<Course> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CourseResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="describes", property="describes", jdbcType=JdbcType.VARCHAR),
        @Result(column="teacherid", property="teacherid", jdbcType=JdbcType.INTEGER),
        @Result(column="pnum", property="pnum", jdbcType=JdbcType.INTEGER),
        @Result(column="electivedate", property="electivedate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="subjectid", property="subjectid", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR)
    })
    List<Course> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, course, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, course, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Course record) {
        return MyBatis3Utils.insert(this::insert, record, course, c ->
            c.map(describes).toProperty("describes")
            .map(teacherid).toProperty("teacherid")
            .map(pnum).toProperty("pnum")
            .map(electivedate).toProperty("electivedate")
            .map(subjectid).toProperty("subjectid")
            .map(status).toProperty("status")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Course record) {
        return MyBatis3Utils.insert(this::insert, record, course, c ->
            c.map(describes).toPropertyWhenPresent("describes", record::getDescribes)
            .map(teacherid).toPropertyWhenPresent("teacherid", record::getTeacherid)
            .map(pnum).toPropertyWhenPresent("pnum", record::getPnum)
            .map(electivedate).toPropertyWhenPresent("electivedate", record::getElectivedate)
            .map(subjectid).toPropertyWhenPresent("subjectid", record::getSubjectid)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Course> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, course, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Course> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, course, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Course> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, course, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Course> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, course, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Course record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(describes).equalTo(record::getDescribes)
                .set(teacherid).equalTo(record::getTeacherid)
                .set(pnum).equalTo(record::getPnum)
                .set(electivedate).equalTo(record::getElectivedate)
                .set(subjectid).equalTo(record::getSubjectid)
                .set(status).equalTo(record::getStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Course record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(describes).equalToWhenPresent(record::getDescribes)
                .set(teacherid).equalToWhenPresent(record::getTeacherid)
                .set(pnum).equalToWhenPresent(record::getPnum)
                .set(electivedate).equalToWhenPresent(record::getElectivedate)
                .set(subjectid).equalToWhenPresent(record::getSubjectid)
                .set(status).equalToWhenPresent(record::getStatus);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Course record) {
        return update(c ->
            c.set(describes).equalTo(record::getDescribes)
            .set(teacherid).equalTo(record::getTeacherid)
            .set(pnum).equalTo(record::getPnum)
            .set(electivedate).equalTo(record::getElectivedate)
            .set(subjectid).equalTo(record::getSubjectid)
            .set(status).equalTo(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Course record) {
        return update(c ->
            c.set(describes).equalToWhenPresent(record::getDescribes)
            .set(teacherid).equalToWhenPresent(record::getTeacherid)
            .set(pnum).equalToWhenPresent(record::getPnum)
            .set(electivedate).equalToWhenPresent(record::getElectivedate)
            .set(subjectid).equalToWhenPresent(record::getSubjectid)
            .set(status).equalToWhenPresent(record::getStatus)
            .where(id, isEqualTo(record::getId))
        );
    }

    //查询所有课程信息
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("course_subject_teacher")
    List<Course> selectCourse(SelectStatementProvider provider);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Course> queryCourse(String status){
        if ("".equals(status)){
            status = null;
        }
        SelectStatementProvider provider = SqlBuilder
                .select(CourseDao.selectList)
                .from(course)
                .where(CourseDynamicSqlSupport.status, isEqualToWhenPresent(status))
                .build().render(RenderingStrategies.MYBATIS3);
        return this.selectCourse(provider);
    }
}