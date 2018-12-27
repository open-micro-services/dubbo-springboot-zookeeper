package com.boonya.dubbo.product.api.service;

import java.util.List;

/**
 * @ClassName: BaseService
 * @Description: TODO(功能描述)
 * @author: pengjunlin
 * @motto: 学习需要毅力，那就秀毅力
 * @date 2018-12-26 17:37
 */
public interface BaseService<T> {

    public Integer insert(T t);

    public Integer update(T t);

    public Integer delete(String id);

    public List<T> getAll();

}
