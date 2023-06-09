
package com.student_management.demo.controller.student.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentImportExcelReqVO {

    /**
     * 学号
     */
    @ExcelProperty("num")
    private String num;

    /**
     * 姓名
     */
    @ExcelProperty("name")
    private String name;

    /**
     * 性别
     */
    @ExcelProperty("sex")
    private String sex;

    /**
     * 邮箱
     */
    @ExcelProperty("email")
    private String email;

    /**
     * 学年
     */
    @ExcelProperty("year")
    private String yearName;

    /**
     * 专业
     */
    @ExcelProperty("major")
    private String majorName;

    /**
     * 班级
     */
    @ExcelProperty("class")
    private String className;


}
