# student_management_back_end
学生综合测评系统后端

## 已完成功能（前后端已完成连接）
### 基本部分
1. 使用token实现用户名及权限的基本信息传递
2. 注销token退出系统
3. 登录用户和非登录用户的权限控制访问（基于Spring Security）
4. 修改密码（初次登录或重置密码之后）
5. 登录使用验证码且密码后端加密存储
### 学生部分
1. GPA：学生信息显示
2. 志愿服务：学生信息显示
3. 科研情况：学生可填写科研情况；上传预览证明资料；查看已提交的内容
4. 社会实践：学生可填写社会实践项目；上传预览证明材料；查看已提交的内容
5. 学生骨干服务岗位：学生填写服务岗位；上传预览证明资料；查看已提交的内容
6. 个人学年总结：学生填写个人学年总结并上传
### 评分老师部分
1. GPA:上传EXCEL表格；汇总信息名单搜索显示；打分；删除成绩
2. 志愿服务：上传EXCEL表格，汇总信息名单搜索显示；打分；删除成绩
3. 科研情况：评委获得学生填写数据，进行打分并上传；预览学生上传证明文件；总览评分状态
4. 社会实践：评委获得学生社会实践信息，打分并上传；预览学生上传证明文件；总览评分状态
5. 骨干服务岗位：评委获得学生骨干服务岗位信息，打分并上传；预览学生上传证明文件；总览评分状态
6. 个人学年总结：评委获得学生填写数据，进行打分并上传；总览评分状态
### 学工部分
1. 已测评学生和未测评学生的汇总信息名单分别显示并导出EXCEL文件，支持按照学号姓名搜索；批量打回成绩
2. 学生个人信息的上传和导出；批量删除学生信息
3. 重置账号密码为学号或职工号
