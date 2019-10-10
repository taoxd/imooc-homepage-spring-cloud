package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageUserCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * HomepageUserCourse 数据表访问接口定义
 */
public interface HomepageUserCourseDao extends JpaRepository<HomepageUserCourse, Long> {

    /**
     * 通过用户 id 寻找数据记录
     *
     * @param userId
     * @return
     */
    List<HomepageUserCourse> findAllByUserId(Long userId);
}
