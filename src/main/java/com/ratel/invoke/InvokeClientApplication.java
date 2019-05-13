package com.ratel.invoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
* 类说明
* <p>
* @author niexiang
* @version  1.0.0
* @date 2018/12/28
*/
@SpringBootApplication(scanBasePackages = "com.ratel")
@EnableDiscoveryClient
@EnableFeignClients("com.ratel")
public class InvokeClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvokeClientApplication.class, args);
	}

}

