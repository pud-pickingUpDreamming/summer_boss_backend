package com.summer.boss.service.impl;

import com.summer.boss.orm.model.PlatformTenant;
import com.summer.boss.orm.dao.PlatformTenantMapper;
import com.summer.boss.service.IPlatformTenantService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 平台租户信息表 服务实现类
 * </p>
 *
 * @author john.wang
 * @since 2021-07-15
 */
@Service
public class PlatformTenantServiceImpl extends ServiceImpl<PlatformTenantMapper, PlatformTenant> implements IPlatformTenantService {

}
