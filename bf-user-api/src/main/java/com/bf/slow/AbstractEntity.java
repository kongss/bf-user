package com.bf.slow;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * xx
 *
 * @author kongshuaishuai
 * Created on 2019/5/20 12:48
 * Email is kongshuaishuai@mrfresh.com
 * Copyright is 北京滴哩网络科技有限公司
 */
@Data
public class AbstractEntity<T extends Model<?>> extends Model<T> {
    private String id;
}
