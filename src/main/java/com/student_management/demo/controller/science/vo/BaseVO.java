package com.student_management.demo.controller.science.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BaseVO {

    @Schema(description = "学生ID",example = "16153")
    private Long stuId;

    @Schema(description = "学生学号")
    private String stuNum;

    @Schema(description = "学生姓名",example = "芋艿")
    private String stuName;

    @Schema(description = "项目名称")
    private String title;

    @Schema(description = "负责人")
    private String director;

    @Schema(description = "组织机构")
    private String constitution;

    @Schema(description = "项目级别")
    private Integer level;

    @Schema(description = "参与时间")
    private String time;

    @Schema(description = "项目成功")
    private String result;

    @Schema(description = "创建者id")
    private Long createUserId;
    @Schema(description = "更新者id")
    private Long updateUserId;

}
