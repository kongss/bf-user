package com.bf.slow.api.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * xx
 *
 * @author kongshuaishuai
 * Created on 2019/5/20 12:48
 * Email is kongshuaishuai@mrfresh.com
 * Copyright is
 */
@Data
public class AbstractEntity<T extends Model<?>> extends Model<T> {
    private String id; //ID
    private String creater; //创建人
    private String createTime; //创建时间
    private String updater; //更新人
    private String updateTime; //更新时间
}
