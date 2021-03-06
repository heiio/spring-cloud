package org.chance.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Administrator on 2017/2/23.
 * @EnableDiscoveryClient 添加Eureka注册
 */

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerKafkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerKafkaApplication.class,args);
    }
}
