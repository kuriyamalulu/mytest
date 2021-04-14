package com.zh.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zh.dao.ProductMapper;
import com.zh.po.Product;
import com.zh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
@Transactional//SpringBoot推荐基于注解进行事务控制
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Override
    public PageInfo<Product> findAllProduct(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Product> productList = productMapper.getAllProduct();
        if (productList.size() == 0){
            return null;
        }else {
            return new PageInfo<>(productList);
        }
    }
    @Override
    public PageInfo<Product> findProductByState(Integer pageNum, Integer pageSize, Integer productState) {
        PageHelper.startPage(pageNum,pageSize);
        Example example = new Example(Product.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("productState",productState);
        List<Product> productList = productMapper.selectByExample(example);
        if (productList.size() == 0){
            return null;
        }else {
            return new PageInfo<>(productList);
        }
    }
    @Override
    public Integer addProduct(Product product) {
        return productMapper.insertSelective(product);
    }

    @Override
    public Product getProductById(Integer productId) {
        return productMapper.selectByPrimaryKey(productId);
    }

    @Override
    public Integer deleteProducts(Integer productId) {
        return productMapper.deleteByPrimaryKey(productId);
    }

    @Override
    public Integer updateProduct(Product product) {
        return productMapper.updateByPrimaryKeySelective(product);
    }


}
