package com.boonya.dubbo.product.provider.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// 扫描数据映射包
@MapperScan(basePackages = "com.boonya.dubbo.product.provider.mapper")
// 引入dubbo-provider.xml配置
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class DubboProductProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboProductProviderApplication.class, args);
	}

}

