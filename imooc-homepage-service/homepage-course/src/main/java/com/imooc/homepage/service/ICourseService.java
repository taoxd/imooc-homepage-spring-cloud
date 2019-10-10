package com.imooc.homepage.service;

import com.imooc.homepage.CourseInfo;
import com.imooc.homepage.CourseInfosRequest;

import java.util.List;

/**
 * 课程相关服务接口定义
 */
public interface ICourseService {
    /**
     * 通过 id 获取课程信息
     *
     * @param id
     * @return
     */
    CourseInfo getCourseInfo(Long id);

    /**
     * 通过 ids 获取课程信息
     *
     * @param request
     * @return
     */
    List<CourseInfo> getCourseInfos(CourseInfosRequest request);
}
