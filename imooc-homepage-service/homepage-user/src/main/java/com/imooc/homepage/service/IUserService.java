package com.imooc.homepage.service;

import com.imooc.homepage.UserInfo;
import com.imooc.homepage.vo.CreateUserRequest;
import com.imooc.homepage.vo.UserCourseInfo;

/**
 * 用户相关服务接口定义
 */
public interface IUserService {

    /**
     * 创建用户
     *
     * @param request
     * @return
     */
    UserInfo createUser(CreateUserRequest request);

    /**
     * 根据 id 获取用户信息
     *
     * @param id
     * @return
     */
    UserInfo getUserInfo(Long id);

    /**
     * 获取用户和课程信息
     *
     * @param id
     * @return
     */
    UserCourseInfo getUserCourseInfo(Long id);
}
