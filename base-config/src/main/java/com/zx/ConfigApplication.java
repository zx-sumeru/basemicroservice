package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * @author ZhangXu
 * @date 2018/8/26 下午11:05
 *
 * @EnableDiscoveryClient  //将应用注册为管理中心的客户端
 * @EnableConfigServer 设置本应用为配置管理服务器
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
