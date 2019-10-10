package com.imooc.homepage.service;

import com.alibaba.fastjson.JSON;
import com.imooc.homepage.Application;
import com.imooc.homepage.CourseInfosRequest;
import com.imooc.homepage.dao.HomepageCourseDao;
import com.imooc.homepage.entity.HomepageCourse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * 课程服务测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class},
        webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class HomepageCourseServiceTest {

    @Autowired
    private HomepageCourseDao courseDao;

    @Autowired
    private ICourseService courseService;

    @Test
    public void testCreateCourseInfo() {
        HomepageCourse course1 = new HomepageCourse("JDK11&12 新特性解读",
                0,
                "https://www.imooc.com",
                "解读 JDK11 和 JDK12 的新版本特性");

        HomepageCourse course2 = new HomepageCourse("基于SpringCloud 微服务架构 广告系统设计与实现",
                1,
                "https://www.imooc.com",
                "广告系统设计与实现");

        System.out.println(courseDao.saveAll(Arrays.asList(course1, course2)).size());
    }

    @Test
    public void testGetCourseInfo() {
        System.out.println(JSON.toJSONString(courseService.getCourseInfo(1L)));
        System.out.println(JSON.toJSONString(courseService.getCourseInfo(99L)));

    }

    @Test
    public void testGetCourseInfos() {
        System.out.println(JSON.toJSONString(
                courseService.getCourseInfos(new CourseInfosRequest(Arrays.asList(1L, 2L)))));

    }
}
