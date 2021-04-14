package com.zh.service.impl;

import com.zh.dao.ProductStateMapper;
import com.zh.po.ProductState;
import com.zh.service.ProductStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ProductStateServiceImpl implements ProductStateService {

    @Autowired
    private ProductStateMapper productStateMapper;
    @Override
    public List<ProductState> getAll() {
        return productStateMapper.selectAll();
    }
}
