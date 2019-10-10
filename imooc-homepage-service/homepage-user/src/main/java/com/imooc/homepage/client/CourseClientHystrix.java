package com.imooc.homepage.client;

import com.imooc.homepage.CourseInfo;
import com.imooc.homepage.CourseInfosRequest;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * 熔断降级策略
 */
@Component
public class CourseClientHystrix implements CourseClient {
    @Override
    public CourseInfo getCourseInfo(Long id) {
        return CourseInfo.invalid();
    }

    @Override
    public List<CourseInfo> getCourseInfos(CourseInfosRequest request) {
        return Collections.emptyList();
    }
}
