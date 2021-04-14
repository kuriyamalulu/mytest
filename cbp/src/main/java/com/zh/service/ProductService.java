package com.zh.service;

import com.github.pagehelper.PageInfo;
import com.zh.po.Product;

public interface ProductService {
    PageInfo<Product> findAllProduct(Integer pageNum, Integer pageSize);

    Integer addProduct(Product product);

    Product getProductById(Integer productId);

    Integer deleteProducts(Integer productId);

    Integer updateProduct(Product product);

    PageInfo<Product> findProductByState(Integer pageNum, Integer pageSize, Integer productState);
}
