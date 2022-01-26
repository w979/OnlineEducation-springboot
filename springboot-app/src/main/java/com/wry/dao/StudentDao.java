package com.wry.dao;

import static com.wry.dao.StudentDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.wry.pojo.Student;
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
public interface StudentDao {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, stuname, stuno, professinol, grade, sex, gpa, phone);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Student> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("StudentResult")
    Optional<Student> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="StudentResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="stuname", property="stuname", jdbcType=JdbcType.VARCHAR),
        @Result(column="stuno", property="stuno", jdbcType=JdbcType.VARCHAR),
        @Result(column="professinol", property="professinol", jdbcType=JdbcType.VARCHAR),
        @Result(column="grade", property="grade", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        @Result(column="gpa", property="gpa", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR)
    })
    List<Student> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Student record) {
        return MyBatis3Utils.insert(this::insert, record, student, c ->
            c.map(stuname).toProperty("stuname")
            .map(stuno).toProperty("stuno")
            .map(professinol).toProperty("professinol")
            .map(grade).toProperty("grade")
            .map(sex).toProperty("sex")
            .map(gpa).toProperty("gpa")
            .map(phone).toProperty("phone")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Student record) {
        return MyBatis3Utils.insert(this::insert, record, student, c ->
            c.map(stuname).toPropertyWhenPresent("stuname", record::getStuname)
            .map(stuno).toPropertyWhenPresent("stuno", record::getStuno)
            .map(professinol).toPropertyWhenPresent("professinol", record::getProfessinol)
            .map(grade).toPropertyWhenPresent("grade", record::getGrade)
            .map(sex).toPropertyWhenPresent("sex", record::getSex)
            .map(gpa).toPropertyWhenPresent("gpa", record::getGpa)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Student> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Student> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Student> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Student> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, student, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Student record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(stuname).equalTo(record::getStuname)
                .set(stuno).equalTo(record::getStuno)
                .set(professinol).equalTo(record::getProfessinol)
                .set(grade).equalTo(record::getGrade)
                .set(sex).equalTo(record::getSex)
                .set(gpa).equalTo(record::getGpa)
                .set(phone).equalTo(record::getPhone);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Student record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(stuname).equalToWhenPresent(record::getStuname)
                .set(stuno).equalToWhenPresent(record::getStuno)
                .set(professinol).equalToWhenPresent(record::getProfessinol)
                .set(grade).equalToWhenPresent(record::getGrade)
                .set(sex).equalToWhenPresent(record::getSex)
                .set(gpa).equalToWhenPresent(record::getGpa)
                .set(phone).equalToWhenPresent(record::getPhone);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Student record) {
        return update(c ->
            c.set(stuname).equalTo(record::getStuname)
            .set(stuno).equalTo(record::getStuno)
            .set(professinol).equalTo(record::getProfessinol)
            .set(grade).equalTo(record::getGrade)
            .set(sex).equalTo(record::getSex)
            .set(gpa).equalTo(record::getGpa)
            .set(phone).equalTo(record::getPhone)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Student record) {
        return update(c ->
            c.set(stuname).equalToWhenPresent(record::getStuname)
            .set(stuno).equalToWhenPresent(record::getStuno)
            .set(professinol).equalToWhenPresent(record::getProfessinol)
            .set(grade).equalToWhenPresent(record::getGrade)
            .set(sex).equalToWhenPresent(record::getSex)
            .set(gpa).equalToWhenPresent(record::getGpa)
            .set(phone).equalToWhenPresent(record::getPhone)
            .where(id, isEqualTo(record::getId))
        );
    }

    //学生列表+多条件查询
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    List<Student> selectStu(SelectStatementProvider provider);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Student> queryStu(String stuname,String grade,String professinol){
        String sname = null;
        if (stuname != null && !("".equals(stuname))){
            sname = "%"+stuname+"%";
        }

        if ("".equals(grade)){
            grade = null;
        }

        if ("".equals(professinol)){
            professinol = null;
        }
        SelectStatementProvider provider = SqlBuilder
                .select(StudentDao.selectList)
                .from(student)
                .where(StudentDynamicSqlSupport.stuname, isLikeWhenPresent(sname))
                .and(StudentDynamicSqlSupport.grade, isEqualToWhenPresent(grade))
                .and(StudentDynamicSqlSupport.professinol, isEqualToWhenPresent(professinol))
                .build().render(RenderingStrategies.MYBATIS3);
        return this.selectStu(provider);
    }


}