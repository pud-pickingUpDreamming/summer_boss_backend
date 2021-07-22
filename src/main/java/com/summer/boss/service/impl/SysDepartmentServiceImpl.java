package com.summer.boss.service.impl;

import com.summer.boss.service.ISysDepartmentService;
import com.summer.boss.orm.model.SysDepartment;
import com.summer.boss.orm.dao.SysDepartmentMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 组织部门表 服务实现类
 * </p>
 *
 * @author john.wang
 * @since 2021-07-15
 */
@Service
public class SysDepartmentServiceImpl extends ServiceImpl<SysDepartmentMapper, SysDepartment> implements ISysDepartmentService {

}
