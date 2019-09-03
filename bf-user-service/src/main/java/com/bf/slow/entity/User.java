package com.bf.slow.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * xx
 *
 * @author kongshuaishuai
 * Created on 2019/5/20 12:48
 * Email is kongshuaishuai@mrfresh.com
 * Copyright is
 */
@Data
@TableName("user")
public class User<T extends Model<?>> extends Model<T> {
    private String id;
    private String nickName;
    private String openId;

}
