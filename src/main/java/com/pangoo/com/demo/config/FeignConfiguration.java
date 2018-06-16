package com.pangoo.com.demo.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.pangoo.com.demo")
public class FeignConfiguration {

}
