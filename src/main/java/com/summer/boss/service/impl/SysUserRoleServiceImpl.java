package com.summer.boss.service.impl;

import com.summer.boss.service.ISysUserRoleService;
import com.summer.boss.orm.model.SysUserRole;
import com.summer.boss.orm.dao.SysUserRoleMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统级别用户角色关联表 服务实现类
 * </p>
 *
 * @author john.wang
 * @since 2021-07-15
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements ISysUserRoleService {

}
