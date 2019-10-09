package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageCourse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * HomepageCourse: 映射实体
 * Long: 主键类型
 */
public interface HomepageCourseDao extends JpaRepository<HomepageCourse, Long> {
}
