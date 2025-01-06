package com.sjitzooi.pocwebsocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // List your allowed origins
                .allowedMethods("GET", "POST", "PUT", "DELETE")// Allow credentials like cookies
                .allowedHeaders("*")
                .maxAge(3600);
    }
}
