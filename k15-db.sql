/*
 Navicat Premium Data Transfer

 Source Server         : aliyun
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : 47.99.48.23:3306
 Source Schema         : k15-db

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 26/01/2022 13:44:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for k15_stu_subject
-- ----------------------------
DROP TABLE IF EXISTS `k15_stu_subject`;
CREATE TABLE `k15_stu_subject`  (
  `studentid` int(0) NOT NULL,
  `subjectid` int(0) DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of k15_stu_subject
-- ----------------------------
INSERT INTO `k15_stu_subject` VALUES (1, 1);
INSERT INTO `k15_stu_subject` VALUES (1, 2);
INSERT INTO `k15_stu_subject` VALUES (1, 3);
INSERT INTO `k15_stu_subject` VALUES (2, 1);
INSERT INTO `k15_stu_subject` VALUES (2, 2);
INSERT INTO `k15_stu_subject` VALUES (2, 3);
INSERT INTO `k15_stu_subject` VALUES (3, 3);
INSERT INTO `k15_stu_subject` VALUES (3, 4);
INSERT INTO `k15_stu_subject` VALUES (3, 5);
INSERT INTO `k15_stu_subject` VALUES (4, 1);
INSERT INTO `k15_stu_subject` VALUES (4, 2);
INSERT INTO `k15_stu_subject` VALUES (4, 3);
INSERT INTO `k15_stu_subject` VALUES (4, 5);
INSERT INTO `k15_stu_subject` VALUES (5, 1);
INSERT INTO `k15_stu_subject` VALUES (5, 2);
INSERT INTO `k15_stu_subject` VALUES (5, 4);
INSERT INTO `k15_stu_subject` VALUES (6, 1);
INSERT INTO `k15_stu_subject` VALUES (6, 2);
INSERT INTO `k15_stu_subject` VALUES (6, 3);
INSERT INTO `k15_stu_subject` VALUES (7, 8);
INSERT INTO `k15_stu_subject` VALUES (7, 9);
INSERT INTO `k15_stu_subject` VALUES (7, 10);
INSERT INTO `k15_stu_subject` VALUES (8, 1);
INSERT INTO `k15_stu_subject` VALUES (9, 11);
INSERT INTO `k15_stu_subject` VALUES (10, 1);
INSERT INTO `k15_stu_subject` VALUES (10, 12);
INSERT INTO `k15_stu_subject` VALUES (10, 7);
INSERT INTO `k15_stu_subject` VALUES (11, 6);
INSERT INTO `k15_stu_subject` VALUES (11, 8);
INSERT INTO `k15_stu_subject` VALUES (12, 2);
INSERT INTO `k15_stu_subject` VALUES (12, 5);
INSERT INTO `k15_stu_subject` VALUES (13, 4);
INSERT INTO `k15_stu_subject` VALUES (13, 5);
INSERT INTO `k15_stu_subject` VALUES (13, 6);
INSERT INTO `k15_stu_subject` VALUES (14, 5);
INSERT INTO `k15_stu_subject` VALUES (15, 1);
INSERT INTO `k15_stu_subject` VALUES (15, 3);
INSERT INTO `k15_stu_subject` VALUES (15, 4);
INSERT INTO `k15_stu_subject` VALUES (16, 2);
INSERT INTO `k15_stu_subject` VALUES (16, 9);
INSERT INTO `k15_stu_subject` VALUES (17, 10);
INSERT INTO `k15_stu_subject` VALUES (17, 12);
INSERT INTO `k15_stu_subject` VALUES (18, 1);
INSERT INTO `k15_stu_subject` VALUES (18, 5);
INSERT INTO `k15_stu_subject` VALUES (19, 4);
INSERT INTO `k15_stu_subject` VALUES (19, 3);
INSERT INTO `k15_stu_subject` VALUES (19, 6);
INSERT INTO `k15_stu_subject` VALUES (19, 8);
INSERT INTO `k15_stu_subject` VALUES (19, 11);

-- ----------------------------
-- Table structure for k15_student
-- ----------------------------
DROP TABLE IF EXISTS `k15_student`;
CREATE TABLE `k15_student`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `stuname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `stuno` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `professinol` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `grade` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `sex` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `gpa` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 25 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of k15_student
-- ----------------------------
INSERT INTO `k15_student` VALUES (1, '李明', '2018001', '软件工程', '2018', '男', '2.69', '15334100963');
INSERT INTO `k15_student` VALUES (2, '黄丽', '2018002', '软件工程', '2018', '女', '2.66', '15334100963');
INSERT INTO `k15_student` VALUES (3, '张三', '2018003', '软件工程', '2018', '男', '1.93', '15334100963');
INSERT INTO `k15_student` VALUES (4, '汇兴东', '2018006', '软件工程', '2018', '女', '1.78', '15334100963');
INSERT INTO `k15_student` VALUES (5, '冬晟亦', '2018924', '软件工程', '2018', '男', '3.61', '15334100963');
INSERT INTO `k15_student` VALUES (6, '天澜文', '2018065', '计算机', '2018', '男', '3.25', '15334100963');
INSERT INTO `k15_student` VALUES (7, '宏洪辉', '2018992', '计算机', '2018', '男', '4.0', '15334100963');
INSERT INTO `k15_student` VALUES (8, '宋文', '2018250', '计算机', '2018', '女', '2.65', '15334100963');
INSERT INTO `k15_student` VALUES (9, '协美华', '2018920', '计算机', '2018', '女', '1.85', '15334100963');
INSERT INTO `k15_student` VALUES (10, '昌隆泰', '2018963', '计算机', '2018', '男', '1.94', '15334100963');
INSERT INTO `k15_student` VALUES (11, '升源禄 ', '2017001', '软件工程', '2017', '男', '3.20', '15334100963');
INSERT INTO `k15_student` VALUES (12, '裕鼎宏', '2017005', '软件工程', '2017', '男', '3.12', '15334100963');
INSERT INTO `k15_student` VALUES (13, '熙承洋', '2017004', '软件工程', '2017', '女', '1.69', '15334100963');
INSERT INTO `k15_student` VALUES (14, '张花', '2017112', '软件工程', '2017', '女', '1.26', '15334100963');
INSERT INTO `k15_student` VALUES (15, '李良', '2017009', '软件工程', '2017', '男', '2.63', '15334100963');
INSERT INTO `k15_student` VALUES (16, '光本旺', '2019006', '机械工程', '2019', '男', '3.12', '15334100963');
INSERT INTO `k15_student` VALUES (17, '百永光', '2019003', '机械工程', '2019', '男', '2.03', '15334100963');
INSERT INTO `k15_student` VALUES (18, '楠立乐', '2019063', '机械工程', '2019', '女', '3.96', '15334100963');
INSERT INTO `k15_student` VALUES (19, '方立宏', '2019033', '机械工程', '2019', '男', '1.22', '15334100963');
INSERT INTO `k15_student` VALUES (21, '张松茂', '2019635', '电子信息工程', '2020', '男', '2.0', '15674896323');
INSERT INTO `k15_student` VALUES (24, '黄硕', '2018954', '计算机', '2018', '男', '4.01', '11111111111');

-- ----------------------------
-- Table structure for k15_subject
-- ----------------------------
DROP TABLE IF EXISTS `k15_subject`;
CREATE TABLE `k15_subject`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sort` int(0) NOT NULL,
  `coursenum` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of k15_subject
-- ----------------------------
INSERT INTO `k15_subject` VALUES (1, '概率论', 1, 0);
INSERT INTO `k15_subject` VALUES (2, '高数', 2, 0);
INSERT INTO `k15_subject` VALUES (3, '英语', 3, 0);
INSERT INTO `k15_subject` VALUES (4, '素养', 4, 0);
INSERT INTO `k15_subject` VALUES (5, 'C语言', 5, 0);
INSERT INTO `k15_subject` VALUES (6, 'Java', 6, 0);
INSERT INTO `k15_subject` VALUES (7, 'PHP', 7, 0);
INSERT INTO `k15_subject` VALUES (8, 'C++', 8, 0);
INSERT INTO `k15_subject` VALUES (9, 'Python', 9, 0);
INSERT INTO `k15_subject` VALUES (10, '计算机组成原理', 10, 0);
INSERT INTO `k15_subject` VALUES (11, '数据结构', 11, 0);
INSERT INTO `k15_subject` VALUES (12, '算法', 12, 0);
INSERT INTO `k15_subject` VALUES (13, '大数据', 13, 0);

-- ----------------------------
-- Table structure for k15_teacher
-- ----------------------------
DROP TABLE IF EXISTS `k15_teacher`;
CREATE TABLE `k15_teacher`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `education` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `career` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `isfamous` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `avatar` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `subjectid` int(0) NOT NULL,
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 46 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of k15_teacher
-- ----------------------------
INSERT INTO `k15_teacher` VALUES (7, '宋立', '人民大学', '人民大学', 'y', '0def2e33b3e2471d8021fa06da258e80.jpg', 10, 'y');
INSERT INTO `k15_teacher` VALUES (14, '张葵', 'HUAT', '汽车工程师', 'y', '0def2e33b3e2471d8021fa06da258e80.jpg', 5, 'y');
INSERT INTO `k15_teacher` VALUES (20, '张三丰', 'HUAT', 'HUAT', 'y', 'a56145fa9b99457696eca472f1f2e4ff.jpg', 9, 'y');
INSERT INTO `k15_teacher` VALUES (23, 'tom', '湖北大学', 'kill', 'n', '6b8961aeab4e42a8a45acc333ed22e4e.jpg', 2, 'y');
INSERT INTO `k15_teacher` VALUES (24, 'Jack', '很棒', '武汉大学', 'n', '', 8, 'y');
INSERT INTO `k15_teacher` VALUES (25, '王德法', '武汉大学', '武汉大学', 'y', '', 3, 'y');
INSERT INTO `k15_teacher` VALUES (26, 'tolk', '武汉大学', '武汉大学', 'n', '', 3, 'y');
INSERT INTO `k15_teacher` VALUES (27, 'Mary', '华科', '厉害', 'n', '', 5, 'y');
INSERT INTO `k15_teacher` VALUES (28, 'POP', '华科', 'nb', 'y', '', 5, 'y');
INSERT INTO `k15_teacher` VALUES (30, '张无忌', '华中科技大学', '上知天文 ', 'y', NULL, 1, 'y');
INSERT INTO `k15_teacher` VALUES (31, '张三丰', '华中科技大学', '30年的从业经历', 'y', NULL, 7, 'y');
INSERT INTO `k15_teacher` VALUES (32, '李芳', '北京外国语大学', 'hello', 'y', '79f00c5e43294f42a82cc8b3a5f47ae6.jpg', 3, 'y');
INSERT INTO `k15_teacher` VALUES (33, '小花', '科技学院', '讲师', 'y', NULL, 11, 'y');
INSERT INTO `k15_teacher` VALUES (34, '白乐', '电子科技大学', 'java讲师', 'y', NULL, 6, 'y');
INSERT INTO `k15_teacher` VALUES (35, '李可', '北京大学', 'PHP', 'y', NULL, 7, 'n');
INSERT INTO `k15_teacher` VALUES (38, '张华', '清华大学', '蛮厉害的', 'y', NULL, 5, 'y');
INSERT INTO `k15_teacher` VALUES (39, '李华', '湖南大学', '挺好', 'y', NULL, 6, 'y');
INSERT INTO `k15_teacher` VALUES (41, '章泽天', '清华大学', '奶茶', 'n', NULL, 6, 'y');
INSERT INTO `k15_teacher` VALUES (42, '阿瑟东', '湖南大学', 'oop', 'n', NULL, 6, 'y');
INSERT INTO `k15_teacher` VALUES (44, '王钢', '武汉大学', '厉害', 'n', NULL, 7, 'y');

-- ----------------------------
-- Table structure for k5_course
-- ----------------------------
DROP TABLE IF EXISTS `k5_course`;
CREATE TABLE `k5_course`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `describes` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `teacherid` int(0) DEFAULT NULL,
  `pnum` int(0) DEFAULT NULL,
  `electivedate` datetime(0) DEFAULT NULL,
  `subjectid` int(0) DEFAULT NULL,
  `status` varchar(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of k5_course
-- ----------------------------
INSERT INTO `k5_course` VALUES (2, 'PHP天下第一', 44, 150, '2022-01-24 16:00:00', 7, 'y');
INSERT INTO `k5_course` VALUES (4, '高等数学', 20, 130, '2022-01-26 16:00:00', 2, 'y');
INSERT INTO `k5_course` VALUES (7, 'java进阶', 25, 0, '2022-01-26 16:00:00', 6, 'n');
INSERT INTO `k5_course` VALUES (10, '数据结构', 32, 200, '2022-01-10 16:00:00', 11, 'y');
INSERT INTO `k5_course` VALUES (11, '素质', 44, 150, '2022-01-16 16:00:00', 4, 'y');
INSERT INTO `k5_course` VALUES (12, 'English', 34, 260, '2022-01-16 16:00:00', 3, 'y');

-- ----------------------------
-- Table structure for login_details
-- ----------------------------
DROP TABLE IF EXISTS `login_details`;
CREATE TABLE `login_details`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `ip` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `operatedate` datetime(0) DEFAULT NULL,
  `msg` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 99 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of login_details
-- ----------------------------
INSERT INTO `login_details` VALUES (1, 'admin', '中国-湖北省-武汉', '2022-01-08 11:48:25', '登录', 'y');
INSERT INTO `login_details` VALUES (17, 'wry', '中国-湖北省-武汉', '2022-01-08 11:51:15', '登录', 'y');
INSERT INTO `login_details` VALUES (18, 'admin', '中国-湖北省-武汉', '2022-01-08 13:27:23', '登录', 'y');
INSERT INTO `login_details` VALUES (19, 'admin', '中国-湖北省-武汉', '2022-01-08 13:28:23', '登录', 'y');
INSERT INTO `login_details` VALUES (20, 'admin', '中国-湖北省-武汉', '2022-01-08 14:22:38', '登录', 'y');
INSERT INTO `login_details` VALUES (21, 'admin', '中国-湖北省-武汉', '2022-01-08 14:22:58', '删除课程信息', 'y');
INSERT INTO `login_details` VALUES (22, 'wry', '中国-湖北省-武汉', '2022-01-08 14:23:17', '登录', 'y');
INSERT INTO `login_details` VALUES (23, 'wry', '中国-湖北省-武汉', '2022-01-08 14:23:25', '删除课程信息', 'y');
INSERT INTO `login_details` VALUES (24, 'admin', '中国-湖北省-武汉', '2022-01-08 14:23:50', '登录', 'y');
INSERT INTO `login_details` VALUES (25, 'wry', '中国-湖北省-武汉', '2022-01-08 14:24:35', '登录', 'y');
INSERT INTO `login_details` VALUES (26, 'wry', '中国-湖北省-武汉', '2022-01-08 14:26:23', '登录', 'y');
INSERT INTO `login_details` VALUES (27, 'wry', '中国-湖北省-武汉', '2022-01-08 14:26:59', '删除课程信息', 'n');
INSERT INTO `login_details` VALUES (28, 'wry', '中国-湖北省-武汉', '2022-01-08 14:35:59', '删除用户', 'n');
INSERT INTO `login_details` VALUES (29, 'admin', '中国-湖北省-武汉', '2022-01-08 14:37:01', '登录', 'y');
INSERT INTO `login_details` VALUES (30, 'admin', '中国-湖北省-武汉', '2022-01-08 14:37:09', '修改用户权限', 'y');
INSERT INTO `login_details` VALUES (31, 'admin', '中国-湖北省-武汉', '2022-01-09 07:03:44', '登录', 'y');
INSERT INTO `login_details` VALUES (32, 'wry', '中国-湖北省-武汉', '2022-01-09 07:04:21', '登录', 'y');
INSERT INTO `login_details` VALUES (33, 'wry', '中国-湖北省-武汉', '2022-01-09 07:09:03', '登录', 'y');
INSERT INTO `login_details` VALUES (34, 'wry', '中国-湖北省-武汉', '2022-01-09 07:09:10', '删除学生信息', 'n');
INSERT INTO `login_details` VALUES (35, 'wry', '中国-湖北省-武汉', '2022-01-09 07:17:15', '登录', 'y');
INSERT INTO `login_details` VALUES (36, 'wry', '中国-湖北省-武汉', '2022-01-09 07:32:57', '删除讲师信息', 'n');
INSERT INTO `login_details` VALUES (37, 'wry', '中国-湖北省-武汉', '2022-01-09 07:38:25', '登录', 'y');
INSERT INTO `login_details` VALUES (38, 'wry', '中国-湖北省-武汉', '2022-01-09 07:42:06', '登录', 'y');
INSERT INTO `login_details` VALUES (39, 'wry', '中国-湖北省-武汉', '2022-01-09 07:44:44', '登录', 'y');
INSERT INTO `login_details` VALUES (40, 'wry', '中国-湖北省-武汉', '2022-01-09 07:50:25', '登录', 'y');
INSERT INTO `login_details` VALUES (41, 'wry', '中国-上海-上海', '2022-01-09 07:52:03', '登录', 'y');
INSERT INTO `login_details` VALUES (42, 'admin', '中国-湖北省-武汉', '2022-01-09 07:52:09', '登录', 'y');
INSERT INTO `login_details` VALUES (43, 'wry', '中国-湖北省-武汉', '2022-01-09 08:05:55', '登录', 'y');
INSERT INTO `login_details` VALUES (44, 'wry', '中国-湖北省-武汉', '2022-01-09 08:06:02', '删除课程信息', 'n');
INSERT INTO `login_details` VALUES (45, 'admin', '中国-湖北省-武汉', '2022-01-09 08:06:15', '登录', 'y');
INSERT INTO `login_details` VALUES (46, 'admin', '中国-湖北省-武汉', '2022-01-09 08:06:21', '删除课程信息', 'y');
INSERT INTO `login_details` VALUES (47, 'wry', '中国-湖北省-武汉', '2022-01-09 08:21:55', '登录', 'y');
INSERT INTO `login_details` VALUES (48, 'admin', '中国-湖北省-武汉', '2022-01-09 08:22:16', '登录', 'y');
INSERT INTO `login_details` VALUES (49, 'wry', '中国-湖北省-武汉', '2022-01-09 09:19:40', '登录', 'y');
INSERT INTO `login_details` VALUES (50, 'wry', '中国-湖北省-武汉', '2022-01-09 09:21:02', '登录', 'y');
INSERT INTO `login_details` VALUES (51, 'wry', '中国-湖北省-武汉', '2022-01-09 10:06:46', '登录', 'y');
INSERT INTO `login_details` VALUES (52, 'wry', '中国-湖北省-武汉', '2022-01-09 12:05:43', '登录', 'y');
INSERT INTO `login_details` VALUES (53, 'wry', '中国-湖北省-武汉', '2022-01-09 14:07:59', '登录', 'y');
INSERT INTO `login_details` VALUES (54, 'admin', '中国-湖北省-武汉', '2022-01-09 14:09:21', '登录', 'y');
INSERT INTO `login_details` VALUES (55, 'admin', '中国-湖北省-武汉', '2022-01-09 14:09:38', '修改用户权限', 'y');
INSERT INTO `login_details` VALUES (56, 'admin', '湖北-武汉-江夏区', '2022-01-09 15:24:40', '登录', 'y');
INSERT INTO `login_details` VALUES (57, 'wry', '湖北-武汉-江夏区', '2022-01-09 15:28:38', '登录', 'y');
INSERT INTO `login_details` VALUES (58, 'wry', '湖北-武汉-江夏区', '2022-01-09 15:30:22', '删除课程信息', 'n');
INSERT INTO `login_details` VALUES (59, 'wry', '湖北-武汉-江夏区', '2022-01-09 15:30:28', '删除课程信息', 'n');
INSERT INTO `login_details` VALUES (60, 'wry', '湖北-武汉-江夏区', '2022-01-10 01:20:01', '登录', 'y');
INSERT INTO `login_details` VALUES (61, 'wry', '湖北-武汉-', '2022-01-10 02:47:35', '登录', 'y');
INSERT INTO `login_details` VALUES (62, 'wry', '东京--', '2022-01-10 02:52:01', '登录', 'y');
INSERT INTO `login_details` VALUES (63, 'wry', '湖北-武汉-', '2022-01-10 02:54:19', '登录', 'y');
INSERT INTO `login_details` VALUES (64, 'wry', '湖北-武汉-江夏区', '2022-01-10 03:18:44', '登录', 'y');
INSERT INTO `login_details` VALUES (65, 'wry', '东京--', '2022-01-10 03:19:39', '登录', 'y');
INSERT INTO `login_details` VALUES (66, 'wry', '湖北-武汉-江夏区', '2022-01-10 13:37:51', '登录', 'y');
INSERT INTO `login_details` VALUES (67, 'wry', '湖北-武汉-洪山区', '2022-01-10 13:47:17', '登录', 'y');
INSERT INTO `login_details` VALUES (68, 'wry\'', '湖北-武汉-洪山区', '2022-01-10 13:48:43', '登录', 'n');
INSERT INTO `login_details` VALUES (69, 'wry', '湖北-武汉-洪山区', '2022-01-10 13:49:08', '登录', 'y');
INSERT INTO `login_details` VALUES (70, 'wry', '湖北-武汉-汉阳区', '2022-01-11 06:31:40', '登录', 'y');
INSERT INTO `login_details` VALUES (71, 'wry', '湖北-武汉-江夏区', '2022-01-11 07:44:35', '登录', 'y');
INSERT INTO `login_details` VALUES (72, 'wry', '湖北-武汉-江夏区', '2022-01-11 15:37:40', '登录', 'y');
INSERT INTO `login_details` VALUES (73, 'wry', '湖北-武汉-江夏区', '2022-01-12 09:11:52', '登录', 'y');
INSERT INTO `login_details` VALUES (74, 'wry', '湖北-武汉-江夏区', '2022-01-13 09:18:58', '登录', 'y');
INSERT INTO `login_details` VALUES (75, 'wry', '湖北-武汉-江夏区', '2022-01-13 10:39:50', '登录', 'y');
INSERT INTO `login_details` VALUES (76, 'wry', '湖北-武汉-江夏区', '2022-01-13 10:40:33', '删除用户', 'n');
INSERT INTO `login_details` VALUES (77, 'wry', '湖北-武汉-江夏区', '2022-01-13 10:40:44', '删除用户', 'n');
INSERT INTO `login_details` VALUES (78, 'wry', '湖北-武汉-江夏区', '2022-01-13 16:25:12', '登录', 'y');
INSERT INTO `login_details` VALUES (79, 'wry', '湖北-武汉-江夏区', '2022-01-14 03:17:27', '登录', 'y');
INSERT INTO `login_details` VALUES (80, 'wry', '湖北-武汉-江夏区', '2022-01-14 13:12:07', '登录', 'y');
INSERT INTO `login_details` VALUES (81, 'wry', '湖北-武汉-江夏区', '2022-01-14 13:28:01', '登录', 'y');
INSERT INTO `login_details` VALUES (82, 'wry', '湖北-武汉-江夏区', '2022-01-14 13:29:47', '删除学生信息', 'n');
INSERT INTO `login_details` VALUES (83, 'admin', '', '2022-01-14 13:29:56', '登录', 'y');
INSERT INTO `login_details` VALUES (84, 'admin', '', '2022-01-14 13:30:08', '删除学生信息', 'y');
INSERT INTO `login_details` VALUES (85, 'admin', '', '2022-01-14 13:30:10', '删除学生信息', 'y');
INSERT INTO `login_details` VALUES (86, 'wry', '', '2022-01-14 13:31:27', '登录', 'y');
INSERT INTO `login_details` VALUES (87, 'wry', '湖北-武汉-江夏区', '2022-01-14 13:33:17', '登录', 'y');
INSERT INTO `login_details` VALUES (88, 'wry', '', '2022-01-14 13:33:43', '登录', 'y');
INSERT INTO `login_details` VALUES (89, 'admin', '湖北-武汉-江夏区', '2022-01-14 13:33:59', '登录', 'y');
INSERT INTO `login_details` VALUES (90, 'wry', '湖北-武汉-江夏区', '2022-01-14 16:55:36', '登录', 'y');
INSERT INTO `login_details` VALUES (91, 'wry', '湖北--', '2022-01-15 11:16:27', '登录', 'y');
INSERT INTO `login_details` VALUES (92, 'wry', '湖北-武汉-江夏区', '2022-01-16 15:13:00', '登录', 'y');
INSERT INTO `login_details` VALUES (93, 'wry', '湖北-武汉-江夏区', '2022-01-16 15:39:59', '登录', 'y');
INSERT INTO `login_details` VALUES (94, 'wry', '湖北-武汉-江夏区', '2022-01-19 08:35:53', '登录', 'y');
INSERT INTO `login_details` VALUES (95, 'wry', '湖北-武汉-江夏区', '2022-01-19 08:37:58', '删除用户', 'n');
INSERT INTO `login_details` VALUES (96, 'wry', '湖北-武汉-江夏区', '2022-01-20 08:34:46', '登录', 'y');
INSERT INTO `login_details` VALUES (97, 'wry', '湖北-武汉-江夏区', '2022-01-20 15:40:43', '登录', 'y');
INSERT INTO `login_details` VALUES (98, 'wry', '湖北-武汉-江夏区', '2022-01-25 10:39:28', '登录', 'y');

-- ----------------------------
-- Table structure for rbac_menu
-- ----------------------------
DROP TABLE IF EXISTS `rbac_menu`;
CREATE TABLE `rbac_menu`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `code` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `link` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `pid` int(0) DEFAULT NULL,
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `levle` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '1表示有子菜单 0表示没有子菜单',
  `type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '0表示菜单，1表示按钮',
  `icon` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '图标',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rbac_menu
-- ----------------------------
INSERT INTO `rbac_menu` VALUES (1, '课程管理', 'course_manage', '', NULL, 'y', '1', '0', 'el-icon-star-off');
INSERT INTO `rbac_menu` VALUES (2, '老师管理', 'teacher_manage', '', NULL, 'y', '1', '0', 'el-icon-platform-eleme');
INSERT INTO `rbac_menu` VALUES (3, '订单管理', 'order_manager', '', NULL, '', '1', '0', 'el-icon-eleme');
INSERT INTO `rbac_menu` VALUES (4, '系统管理', 'sys_manager', ' ', NULL, 'y', '1', '0', 'el-icon-s-goods');
INSERT INTO `rbac_menu` VALUES (5, '用户管理', 'user_manager', '/user_manager', 4, NULL, '0', '0', 'el-icon-user');
INSERT INTO `rbac_menu` VALUES (6, '角色管理', 'role_manager', '/role_manager', 4, NULL, '0', '0', 'el-icon-s-order');
INSERT INTO `rbac_menu` VALUES (7, '课程信息管理', 'course_info_manager', '/course_info_manager', 1, NULL, '0', '0', 'el-icon-s-ticket');
INSERT INTO `rbac_menu` VALUES (8, '课程类别管理', 'course_type_manager', '/course_type_manager', 1, NULL, '0', '0', 'el-icon-s-marketing');
INSERT INTO `rbac_menu` VALUES (9, '老师信息管理', 'teacher_info_manager', '/teacher_info_manager', 2, NULL, '0', '0', 'el-icon-s-data');
INSERT INTO `rbac_menu` VALUES (10, '订单信息管理', 'order_info_manager', NULL, 3, NULL, '0', '0', 'el-icon-suitcase');
INSERT INTO `rbac_menu` VALUES (11, '回收站', 'course', NULL, NULL, NULL, '1', '0', 'el-icon-coin');

-- ----------------------------
-- Table structure for rbac_perms
-- ----------------------------
DROP TABLE IF EXISTS `rbac_perms`;
CREATE TABLE `rbac_perms`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `name` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `code` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `link` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `parentid` int(0) DEFAULT NULL,
  `type` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'm:菜单 p：数据',
  `status` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '1:正常 2：禁用',
  `percode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_ParentID`(`parentid`) USING BTREE,
  CONSTRAINT `FK_ParentID` FOREIGN KEY (`parentid`) REFERENCES `rbac_perms` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rbac_perms
-- ----------------------------
INSERT INTO `rbac_perms` VALUES (16, '讲师管理', 'teacher/manager', NULL, NULL, 'm', 'y', NULL, 'el-icon-s-custom');
INSERT INTO `rbac_perms` VALUES (17, '讲师列表', ' teacher/list', 'teacher', 16, 'm', 'y', 'teacher:list', NULL);
INSERT INTO `rbac_perms` VALUES (18, '新增讲师', 'teacher/add', 'teacher/add', 17, 'p', 'y', 'teacher:add', NULL);
INSERT INTO `rbac_perms` VALUES (19, '删除讲师', 'teacher/delete', 'teacher/delete', 17, 'p', 'y', 'teacher:delete', NULL);
INSERT INTO `rbac_perms` VALUES (20, '修改讲师', 'teacher/update', 'teacher/update', 17, 'p', 'y', 'teacher:update', NULL);
INSERT INTO `rbac_perms` VALUES (21, '课程管理', 'course/manager', NULL, NULL, 'm', 'y', NULL, 'el-icon-school');
INSERT INTO `rbac_perms` VALUES (22, '课程列表', 'course/list', 'course', 21, 'm', 'y', 'course:list', NULL);
INSERT INTO `rbac_perms` VALUES (23, '新增课程', 'course/add', 'course/add', 22, 'p', 'y', 'course:add', NULL);
INSERT INTO `rbac_perms` VALUES (24, '删除课程', 'course/delete', 'course/delete', 22, 'p', 'y', 'course:delete', NULL);
INSERT INTO `rbac_perms` VALUES (25, '修改课程', 'course/update', 'course/update', 22, 'p', 'y', 'course:update', NULL);
INSERT INTO `rbac_perms` VALUES (26, '权限管理', 'right/manager', NULL, NULL, 'm', 'y', NULL, 'el-icon-set-up');
INSERT INTO `rbac_perms` VALUES (27, '权限列表', 'right/list', 'right', 26, 'm', 'y', 'right:list', NULL);
INSERT INTO `rbac_perms` VALUES (28, '新增权限', 'right/add', 'right/add', 27, 'p', 'y', 'right:add', NULL);
INSERT INTO `rbac_perms` VALUES (29, '删除权限', 'right/delete', 'right/delete', 27, 'p', 'y', 'right:delete', NULL);
INSERT INTO `rbac_perms` VALUES (30, '修改权限', 'right/update', 'right/update', 27, 'p', 'y', 'right:update', NULL);
INSERT INTO `rbac_perms` VALUES (31, '学生管理', 'student/manager', NULL, NULL, 'm', 'y', NULL, 'el-icon-user-solid');
INSERT INTO `rbac_perms` VALUES (32, '学生列表', 'student/list', 'student', 31, 'm', 'y', 'student:list', NULL);
INSERT INTO `rbac_perms` VALUES (33, '添加学生', 'student/add', 'student/add', 32, 'p', 'y', 'student:add', NULL);
INSERT INTO `rbac_perms` VALUES (34, '删除学生', 'student/delete', 'student/delete', 32, 'p', 'y', 'student:delete', NULL);
INSERT INTO `rbac_perms` VALUES (35, '修改学生', 'student/update', 'student/update', 32, 'p', 'y', 'student:update', NULL);
INSERT INTO `rbac_perms` VALUES (36, '数据统计', 'DataCount', NULL, NULL, 'm', 'y', NULL, 'el-icon-mouse');
INSERT INTO `rbac_perms` VALUES (37, '数据报表', 'data/list', 'data', 36, 'm', 'y', 'data:list', NULL);
INSERT INTO `rbac_perms` VALUES (38, '角色管理', 'roles/manager', NULL, NULL, 'm', 'y', NULL, 'el-icon-share');
INSERT INTO `rbac_perms` VALUES (39, '角色列表', 'roles/list', 'role', 38, 'm', 'y', 'role:list', NULL);
INSERT INTO `rbac_perms` VALUES (40, '新增角色', 'role/add', 'role/add', 39, 'p', 'y', 'role:add', NULL);
INSERT INTO `rbac_perms` VALUES (41, '删除角色', 'role/delete', 'role/delete', 38, 'p', 'y', 'role:delete', NULL);
INSERT INTO `rbac_perms` VALUES (42, '用户管理', 'user/manager', NULL, NULL, 'm', 'y', NULL, 'el-icon-user');
INSERT INTO `rbac_perms` VALUES (43, '用户列表', 'user/list', 'user', 42, 'm', 'y', 'user:list', NULL);
INSERT INTO `rbac_perms` VALUES (44, '新增用户', 'user/add', 'user/add', 43, 'p', 'y', 'user:add', NULL);
INSERT INTO `rbac_perms` VALUES (45, '修改用户', 'user/update', 'user/update', 43, 'p', 'y', 'user:update', NULL);
INSERT INTO `rbac_perms` VALUES (46, '删除用户', 'user/delete', 'user/delete', 43, 'p', 'y', 'user:delete', NULL);

-- ----------------------------
-- Table structure for rbac_user
-- ----------------------------
DROP TABLE IF EXISTS `rbac_user`;
CREATE TABLE `rbac_user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rbac_user
-- ----------------------------
INSERT INTO `rbac_user` VALUES (1, 'wry', '$2a$10$i2F/vWkbUUoGWvDdZRjL3Oc8/fv7/svw03AZSlyNy0a1KMJLHJEh.', 'y', 'abcd', 'wry@qq.com', '../../assets/userAvatar/1.png\"');
INSERT INTO `rbac_user` VALUES (2, 'lisi', '$2a$10$r0WhY3UQIHnLuqid39rVZ..tONm0JAczcgJ73m3cTlIrC3qB.XYiu', 'n', 'abcd', 'lisi@qq.com', '../../assets/userAvatar/2.jpg\"');
INSERT INTO `rbac_user` VALUES (3, 'admin', '$2a$10$mMW112n8NhJnCuDY72RXkOVt3fP335c40kGD1vsUpGNfGUMeEAhpG', 'y', 'abcd', 'xiaokongming@qq.com', '../../assets/userAvatar/admin.jpeg\"');
INSERT INTO `rbac_user` VALUES (8, 'lucy', '$2a$10$mMW112n8NhJnCuDY72RXkOVt3fP335c40kGD1vsUpGNfGUMeEAhpG', 'y', NULL, 'lucy@163.com', '../../assets/userAvatar/3.jpg\"');

-- ----------------------------
-- Table structure for rbac_user_perm
-- ----------------------------
DROP TABLE IF EXISTS `rbac_user_perm`;
CREATE TABLE `rbac_user_perm`  (
  `userid` int(0) NOT NULL,
  `permid` int(0) NOT NULL,
  PRIMARY KEY (`userid`, `permid`) USING BTREE,
  INDEX `FK_PERMID2`(`permid`) USING BTREE,
  CONSTRAINT `FK_PERMID2` FOREIGN KEY (`permid`) REFERENCES `rbac_perms` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_USERID2` FOREIGN KEY (`userid`) REFERENCES `rbac_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rbac_user_perm
-- ----------------------------
INSERT INTO `rbac_user_perm` VALUES (1, 16);
INSERT INTO `rbac_user_perm` VALUES (2, 16);
INSERT INTO `rbac_user_perm` VALUES (3, 16);
INSERT INTO `rbac_user_perm` VALUES (1, 17);
INSERT INTO `rbac_user_perm` VALUES (2, 17);
INSERT INTO `rbac_user_perm` VALUES (3, 17);
INSERT INTO `rbac_user_perm` VALUES (1, 18);
INSERT INTO `rbac_user_perm` VALUES (2, 18);
INSERT INTO `rbac_user_perm` VALUES (3, 18);
INSERT INTO `rbac_user_perm` VALUES (2, 19);
INSERT INTO `rbac_user_perm` VALUES (3, 19);
INSERT INTO `rbac_user_perm` VALUES (2, 20);
INSERT INTO `rbac_user_perm` VALUES (3, 20);
INSERT INTO `rbac_user_perm` VALUES (1, 21);
INSERT INTO `rbac_user_perm` VALUES (3, 21);
INSERT INTO `rbac_user_perm` VALUES (8, 21);
INSERT INTO `rbac_user_perm` VALUES (1, 22);
INSERT INTO `rbac_user_perm` VALUES (3, 22);
INSERT INTO `rbac_user_perm` VALUES (8, 22);
INSERT INTO `rbac_user_perm` VALUES (1, 23);
INSERT INTO `rbac_user_perm` VALUES (3, 23);
INSERT INTO `rbac_user_perm` VALUES (8, 23);
INSERT INTO `rbac_user_perm` VALUES (3, 24);
INSERT INTO `rbac_user_perm` VALUES (8, 24);
INSERT INTO `rbac_user_perm` VALUES (3, 25);
INSERT INTO `rbac_user_perm` VALUES (2, 26);
INSERT INTO `rbac_user_perm` VALUES (3, 26);
INSERT INTO `rbac_user_perm` VALUES (8, 26);
INSERT INTO `rbac_user_perm` VALUES (2, 27);
INSERT INTO `rbac_user_perm` VALUES (3, 27);
INSERT INTO `rbac_user_perm` VALUES (8, 27);
INSERT INTO `rbac_user_perm` VALUES (2, 28);
INSERT INTO `rbac_user_perm` VALUES (3, 28);
INSERT INTO `rbac_user_perm` VALUES (8, 28);
INSERT INTO `rbac_user_perm` VALUES (2, 29);
INSERT INTO `rbac_user_perm` VALUES (3, 29);
INSERT INTO `rbac_user_perm` VALUES (8, 29);
INSERT INTO `rbac_user_perm` VALUES (2, 30);
INSERT INTO `rbac_user_perm` VALUES (3, 30);
INSERT INTO `rbac_user_perm` VALUES (8, 30);
INSERT INTO `rbac_user_perm` VALUES (1, 31);
INSERT INTO `rbac_user_perm` VALUES (2, 31);
INSERT INTO `rbac_user_perm` VALUES (3, 31);
INSERT INTO `rbac_user_perm` VALUES (1, 32);
INSERT INTO `rbac_user_perm` VALUES (2, 32);
INSERT INTO `rbac_user_perm` VALUES (3, 32);
INSERT INTO `rbac_user_perm` VALUES (1, 33);
INSERT INTO `rbac_user_perm` VALUES (2, 33);
INSERT INTO `rbac_user_perm` VALUES (3, 33);
INSERT INTO `rbac_user_perm` VALUES (3, 34);
INSERT INTO `rbac_user_perm` VALUES (3, 35);
INSERT INTO `rbac_user_perm` VALUES (1, 36);
INSERT INTO `rbac_user_perm` VALUES (3, 36);
INSERT INTO `rbac_user_perm` VALUES (1, 37);
INSERT INTO `rbac_user_perm` VALUES (3, 37);
INSERT INTO `rbac_user_perm` VALUES (1, 38);
INSERT INTO `rbac_user_perm` VALUES (3, 38);
INSERT INTO `rbac_user_perm` VALUES (1, 39);
INSERT INTO `rbac_user_perm` VALUES (3, 39);
INSERT INTO `rbac_user_perm` VALUES (1, 40);
INSERT INTO `rbac_user_perm` VALUES (3, 40);
INSERT INTO `rbac_user_perm` VALUES (3, 41);
INSERT INTO `rbac_user_perm` VALUES (1, 42);
INSERT INTO `rbac_user_perm` VALUES (3, 42);
INSERT INTO `rbac_user_perm` VALUES (1, 43);
INSERT INTO `rbac_user_perm` VALUES (3, 43);
INSERT INTO `rbac_user_perm` VALUES (1, 44);
INSERT INTO `rbac_user_perm` VALUES (3, 44);
INSERT INTO `rbac_user_perm` VALUES (3, 45);
INSERT INTO `rbac_user_perm` VALUES (3, 46);

SET FOREIGN_KEY_CHECKS = 1;
