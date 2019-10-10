package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * HomepageUser 数据表访问接口定义
 */
public interface HomepageUserDao extends JpaRepository<HomepageUser, Long> {
    /**
     * 通过用户名寻找数据记录
     *
     * @param username
     * @return
     */
    HomepageUser findByUsername(String username);
}
