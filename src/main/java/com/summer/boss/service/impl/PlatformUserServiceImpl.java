package com.summer.boss.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summer.boss.orm.dao.PlatformUserMapper;
import com.summer.boss.orm.dao.SysUserRoleMapper;
import com.summer.boss.orm.model.PlatformUser;
import com.summer.boss.orm.model.SysUserRole;
import com.summer.boss.service.IPlatformUserService;
import com.summer.boss.utils.BeanUtil;
import com.summer.boss.vo.user.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author john
 */
@Service
@Slf4j
public class PlatformUserServiceImpl extends ServiceImpl<PlatformUserMapper, PlatformUser> implements IPlatformUserService {

    @Resource
    private SysUserRoleMapper userRoleMapper;

    @Override
    public UserVO getUser(String username) {
        PlatformUser user = this.getOne(new QueryWrapper<PlatformUser>().eq(PlatformUser.USERNAME, username));
        if (ObjectUtils.isEmpty(user) || user.getId() == null) {
            return null;
        }

        UserVO userVO = new UserVO();
        BeanUtil.copyProperties(user, userVO, null);

        List<SysUserRole> roles = this.userRoleMapper.selectList(new QueryWrapper<SysUserRole>()
                .select(SysUserRole.ROLE_ID).eq(SysUserRole.USER_ID, user.getId()));

        List<Integer> roleIds = roles.stream().map(SysUserRole::getRoleId).collect(Collectors.toList());
        userVO.setRoles(roleIds);

        return userVO;
    }
}
