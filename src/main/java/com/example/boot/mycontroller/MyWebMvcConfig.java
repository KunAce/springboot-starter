package com.example.boot.mycontroller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/book/**")
                .allowedHeaders("*")
                .allowedMethods("*")
                .maxAge(1800)
                .allowedOrigins("http://localhost:8081");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(new MyInterceptor1())
//                .addPathPatterns("/**")
//                .excludePathPatterns("/hello");
//    }
}
