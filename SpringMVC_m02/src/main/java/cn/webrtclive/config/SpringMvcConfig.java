package cn.webrtclive.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan("cn.webrtclive.controller")
public class SpringMvcConfig {
}


