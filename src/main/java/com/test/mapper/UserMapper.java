package com.test.mapper;

import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2019/2/18.
 */
@Repository
public interface UserMapper {
    /**
     * 获得密码
     * @param username 用户名
     */
    String getPassword(String username);

    /**
     * 获得角色权限
     * @param username 用户名
     * @return user/admin
     */
    String getRole(String username);
}
