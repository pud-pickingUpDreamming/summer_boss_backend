package com.summer.boss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.summer.boss.orm.model.PlatformUser;
import com.summer.boss.vo.user.UserVO;

/**
 * @author john
 */
public interface IPlatformUserService extends IService<PlatformUser> {

    /**
     * 获取用户信息
     * @param username 用户名
     * @return 用户信息
     */
    UserVO getUser(String username);
}
