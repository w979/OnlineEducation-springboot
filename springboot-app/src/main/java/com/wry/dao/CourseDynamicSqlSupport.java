package com.wry.dao;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CourseDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Course course = new Course();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = course.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> describes = course.describes;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> teacherid = course.teacherid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> pnum = course.pnum;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> electivedate = course.electivedate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> subjectid = course.subjectid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> status = course.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Course extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> describes = column("describes", JDBCType.VARCHAR);

        public final SqlColumn<Integer> teacherid = column("teacherid", JDBCType.INTEGER);

        public final SqlColumn<Integer> pnum = column("pnum", JDBCType.INTEGER);

        public final SqlColumn<Date> electivedate = column("electivedate", JDBCType.TIMESTAMP);

        public final SqlColumn<Integer> subjectid = column("subjectid", JDBCType.INTEGER);

        public final SqlColumn<String> status = column("status", JDBCType.VARCHAR);

        public Course() {
            super("k5_course");
        }
    }
}