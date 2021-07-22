package com.summer.boss.service.impl;

import com.summer.boss.service.ISysMenuService;
import com.summer.boss.orm.model.SysMenu;
import com.summer.boss.orm.dao.SysMenuMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统菜单表 服务实现类
 * </p>
 *
 * @author john.wang
 * @since 2021-07-15
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements ISysMenuService {

}
