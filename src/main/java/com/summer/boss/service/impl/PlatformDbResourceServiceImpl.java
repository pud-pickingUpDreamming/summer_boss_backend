package com.summer.boss.service.impl;

import com.summer.boss.service.IPlatformDbResourceService;
import com.summer.boss.orm.model.PlatformDbResource;
import com.summer.boss.orm.dao.PlatformDbResourceMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据库资源表 服务实现类
 * </p>
 *
 * @author john.wang
 * @since 2021-07-15
 */
@Service
public class PlatformDbResourceServiceImpl extends ServiceImpl<PlatformDbResourceMapper, PlatformDbResource> implements IPlatformDbResourceService {

}
