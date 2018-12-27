package com.boonya.dubbo.product.customer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.boonya.dubbo.product.api.entity.Product;
import com.boonya.dubbo.product.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: ProductController
 * @Description: TODO(商品试图控制器)
 * @author: pengjunlin
 * @motto: 学习需要毅力，那就秀毅力
 * @date 2018-12-26 23:06
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/getAll")
    public List<Product> getAll(){
        return productService.getAll();
    }
}
