package com.summer.boss.service.impl;

import com.summer.boss.service.ISysDataAuthService;
import com.summer.boss.orm.model.SysDataAuth;
import com.summer.boss.orm.dao.SysDataAuthMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 数据权限表 服务实现类
 * </p>
 *
 * @author john.wang
 * @since 2021-07-15
 */
@Service
public class SysDataAuthServiceImpl extends ServiceImpl<SysDataAuthMapper, SysDataAuth> implements ISysDataAuthService {

}
