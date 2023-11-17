package com.spring.test.demo.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class ConfigProperties {
    @Value("${secretKey}")
    public String SecretKey;

    public void LogValues(){
        System.out.println(SecretKey);
    }
}
