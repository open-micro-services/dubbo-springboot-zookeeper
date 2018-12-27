package com.boonya.dubbo.product.provider.main;

import com.boonya.dubbo.product.api.entity.Product;
import com.boonya.dubbo.product.provider.mapper.ProductMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboProductProviderApplication.class)
@EnableAutoConfiguration
public class DubboProductProviderApplicationTests {

	@Autowired
	ProductMapper productMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void insert()
	{
		Assert.assertNotNull(productMapper);
		Product product=new Product();
		product.setId(UUID.randomUUID().toString());
		product.setName("PRO-ITEM-2018-"+new Random(20000).nextInt());
		product.setPrice(new BigDecimal(new Random().nextDouble()));
		product.setCategroy("DRUG");
		product.setDiscount(new BigDecimal(7.5));
		product.setAddress("Chengdu,Sichuan,China");
		productMapper.insert(product);
	}

	@Test
	public void getAll()
	{
		Assert.assertNotNull(productMapper);
		List<Product> list=productMapper.selectAll();
		Assert.assertNotNull(list);
	}

}

