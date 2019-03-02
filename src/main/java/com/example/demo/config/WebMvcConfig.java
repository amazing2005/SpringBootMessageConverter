package com.example.demo.config;

import com.example.demo.http.messsage.PropertiesPersonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Web MVC 配置
 *
 * @author mercyblitz
 * @date 2017-10-14
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    public void extendMessageConverters(
            List<HttpMessageConverter<?>> converters) {

        converters.add(new PropertiesPersonHttpMessageConverter());
    }

}
