package com.bf.slow.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
@Data
@TableName("slow")
public class Slow extends AbstractEntity {
    private String title; //标题
    private String synopsis; //简介
    private String beginTime; //开始时间
    private String endTime; //结束时间
    private Integer status; //状态. 0:禁用, 1:启用
    private String code; //code

}