package com.boonya.dubbo.product.provider.mapper;

import com.boonya.dubbo.product.api.entity.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository("productMapper")
public interface ProductMapper extends BaseMapper<Product> {

    int deleteByPrimaryKey(@Param("id") String id);

    int insert(@Param("pro")  Product product);

    int insertSelective( @Param("pro")  Product product);

    List<Product> selectAll();

    Product selectByPrimaryKey(@Param("id") String id);

    int updateByPrimaryKeySelective( @Param("pro") Product product);

    int updateByPrimaryKey( @Param("pro") Product product);
}