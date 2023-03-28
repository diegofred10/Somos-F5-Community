package com.somosf5community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

<<<<<<< HEAD
@Configuration
public class WebConfig implements WebMvcConfigurer{
    
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
            .addMapping("/**")
            .allowedOrigins("*")
            .allowedMethods("GET","POST","PUT","DELETE","OPTION");
=======

@Configuration
public class WebConfig implements  WebMvcConfigurer {
    @Override

    public void addCorsMappings(CorsRegistry registry){
        registry
        .addMapping("/**")
        .allowedOrigins("http://localhost:9000")
        .allowCredentials(true)
        .allowedMethods("GET", "POST", "DELETE", "OPTION", "PUT");
>>>>>>> develop
    }
}