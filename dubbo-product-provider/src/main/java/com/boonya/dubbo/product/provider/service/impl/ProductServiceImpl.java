package com.boonya.dubbo.product.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boonya.dubbo.product.api.entity.Product;
import com.boonya.dubbo.product.api.service.ProductService;
import com.boonya.dubbo.product.provider.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @ClassName: ProductServiceImpl
 * @Description: TODO(商品接口实现)
 * @author: pengjunlin
 * @motto: 学习需要毅力，那就秀毅力
 * @date 2018-12-26 18:02
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Integer insert(Product product) {
        return productMapper.insert(product);
    }

    @Override
    public Integer update(Product product) {
        return productMapper.updateByPrimaryKey(product);
    }

    @Override
    public Integer delete(String id) {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List getAll() {
        return productMapper.selectAll();
    }
}
