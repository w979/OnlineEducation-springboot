package com.wry.dao;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class TeacherDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Teacher teacher = new Teacher();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = teacher.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> name = teacher.name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> education = teacher.education;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> career = teacher.career;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> isfamous = teacher.isfamous;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> avatar = teacher.avatar;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> subjectid = teacher.subjectid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> status = teacher.status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Teacher extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> education = column("education", JDBCType.VARCHAR);

        public final SqlColumn<String> career = column("career", JDBCType.VARCHAR);

        public final SqlColumn<String> isfamous = column("isfamous", JDBCType.CHAR);

        public final SqlColumn<String> avatar = column("avatar", JDBCType.VARCHAR);

        public final SqlColumn<Integer> subjectid = column("subjectid", JDBCType.INTEGER);

        public final SqlColumn<String> status = column("status", JDBCType.CHAR);

        public Teacher() {
            super("k15_teacher");
        }
    }
}