package com.summer.boss.service;


import com.summer.boss.dto.OperationLog;

public interface IOperationLogService {
    void saveLog(OperationLog operationLog);
}
