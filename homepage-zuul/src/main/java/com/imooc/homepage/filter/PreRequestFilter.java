package com.imooc.homepage.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 在过滤器中存储客户端发起请求的时间戳
 */
@Component
public class PreRequestFilter extends ZuulFilter {

    @Override
    public String filterType() {
        //过滤器类型pre
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        //过滤器执行顺序，数值越小，优先级越高
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否启用当前过滤器
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        //用于在过滤器之间传递消息
        RequestContext ctx = RequestContext.getCurrentContext();
        ctx.set("startTime", System.currentTimeMillis());

        return null;
    }
}
