package com.li.springcloudserverprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
/**
 * spring cloud server provider
 */
public class SpringcloudServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServerProviderApplication.class, args);
    }
}
