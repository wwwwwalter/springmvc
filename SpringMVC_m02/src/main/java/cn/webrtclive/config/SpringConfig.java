package cn.webrtclive.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"cn.webrtclive.service", "cn.webrtclive.dao"})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
