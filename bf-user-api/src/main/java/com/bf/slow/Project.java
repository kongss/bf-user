package com.bf.slow;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("project")
public class Project extends AbstractEntity {
    private String name;
    private Integer status;
    private Integer teaCode;
    private Date endTime;
    private Date beginTime;
    private Date createTime;
    private Date updateTime;
    private String founder;
}