package com.bf.slow.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("project")
public class Project extends AbstractEntity {
    private String name; //名称
    private Integer teaCode; //父code
    private Integer status; //状态. 0:禁用, 1:启用
    private Date beginTime; //开始时间
    private Date endTime; //结束时间

}