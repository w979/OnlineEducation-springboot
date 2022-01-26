package com.wry.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class StudentDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Student student = new Student();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = student.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> stuname = student.stuname;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> stuno = student.stuno;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> professinol = student.professinol;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> grade = student.grade;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sex = student.sex;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> gpa = student.gpa;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> phone = student.phone;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Student extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> stuname = column("stuname", JDBCType.VARCHAR);

        public final SqlColumn<String> stuno = column("stuno", JDBCType.VARCHAR);

        public final SqlColumn<String> professinol = column("professinol", JDBCType.VARCHAR);

        public final SqlColumn<String> grade = column("grade", JDBCType.VARCHAR);

        public final SqlColumn<String> sex = column("sex", JDBCType.VARCHAR);

        public final SqlColumn<String> gpa = column("gpa", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public Student() {
            super("k15_student");
        }
    }
}