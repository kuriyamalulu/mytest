package com.zh.dao;

import com.zh.po.Product;
import org.w3c.dom.stylesheets.LinkStyle;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProductMapper extends Mapper<Product> {
    List<Product> getAllProduct() ;
}
