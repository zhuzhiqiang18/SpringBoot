package com.zzq.demo.conf;

import com.zzq.demo.interceptor.WebInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConf implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //addPathPatterns("/**") addPathPatterns拦截所有方法  excludePathPatterns("/user/test")白名单
        registry.addInterceptor(new WebInterceptor()).addPathPatterns("/**").excludePathPatterns("/user/test");
    }
}
