package com.bf.slow.api.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bf.slow.api.ProjectApi;
import com.bf.slow.api.entity.Project;
import com.bf.slow.dao.ProjectMapper;
import org.apache.dubbo.config.annotation.Service;

/**
 * xx
 *
 * @author kongshuaishuai
 * Created on 2019/5/20 12:48
 * Email is kongshuaishuai@mrfresh.com
 * Copyright is 北京滴哩网络科技有限公司
 */
@Service
public class ProjectImpl extends ServiceImpl<ProjectMapper, Project> implements ProjectApi {

}
