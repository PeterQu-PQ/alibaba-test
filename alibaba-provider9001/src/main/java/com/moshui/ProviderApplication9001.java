package com.moshui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Peter
 * @date 2021/1/13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication9001.class);
    }
}
