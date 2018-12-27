package com.boonya.dubbo.product.customer.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// 扫描web包以解决url服务未作映射问题
@ComponentScan("com.boonya.dubbo.product.customer.web")
// 引入dubbo-customer.xml配置
@ImportResource(value = {"classpath:dubbo-customer.xml"})
public class DubboProductCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProductCustomerApplication.class, args);
	}

}

