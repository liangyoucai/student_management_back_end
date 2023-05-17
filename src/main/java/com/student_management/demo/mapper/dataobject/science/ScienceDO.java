package com.student_management.demo.mapper.dataobject.science;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value="science")//数据库表名
public class ScienceDO {
    /**
     * id
     *
     */
    @TableId(type = IdType.AUTO)//设为自增
    private Long id;

    /**
     * 学生id
     */
    private Long stu_id;

    /**
     * 学号
     */
    private Long stu_num;

    /**
     * 姓名
     */
    private String stu_name;

    /**
     * 评价状态
     * 0：未确认(default)
     * 1：已确认
     * 2：有误
     */
    private Integer status=0;

    private String title;
    private String director;
    private String constitution;
    private Integer level;
    private String time;
    private String result;
    private Integer score;
}