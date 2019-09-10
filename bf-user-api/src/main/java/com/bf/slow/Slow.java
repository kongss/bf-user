package com.bf.slow;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
@Data
@TableName("slow")
public class Slow extends AbstractEntity {
    private String title;
    private String synopsis;
    private Date beginTime;
    private Date endTime;
    private Integer status;
    private Integer code;
    private Date createTime;
    private Date updateTime;
    private String founder;

}