package com.summer.boss.service.impl;

import com.summer.boss.service.IOperationLogService;
import com.summer.boss.dto.OperationLog;
import com.summer.boss.orm.model.SysOperationLog;
import com.summer.boss.orm.dao.SysOperationLogMapper;
import com.summer.boss.service.ISysOperationLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summer.boss.utils.BeanUtil;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统操作日志表 服务实现类
 * </p>
 *
 * @author john.wang
 * @since 2021-07-15
 */
@Service
public class SysOperationLogServiceImpl extends ServiceImpl<SysOperationLogMapper, SysOperationLog> implements ISysOperationLogService, IOperationLogService {

    @Override
    public void saveLog(OperationLog operationLog) {
        SysOperationLog log = new SysOperationLog();
        BeanUtil.copyProperties(operationLog, log, null);
        log.insert();
    }
}
