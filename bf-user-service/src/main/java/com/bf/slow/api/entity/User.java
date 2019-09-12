package com.bf.slow.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("user")
public class User extends AbstractEntity {
    private String nickName; //普通用户昵称
    private String sex; //普通用户性别，1为男性，2为女性
    private String province; //普通用户个人资料填写的省份
    private String city; //普通用户个人资料填写的城市
    private String country; //国家，如中国为CN
    private String headimgurl; //用户头像Url
    private String privilege; //用户特权信息，json数组，如微信沃卡用户为（chinaunicom）
    private String unionId; //用户统一标识
    private String openId; //普通用户的标识，对当前开发者帐号唯一

}
