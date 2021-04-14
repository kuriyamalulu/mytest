package com.zh.web;

import com.zh.po.ProductState;
import com.zh.service.ProductStateService;
import com.zh.web.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/productState")
public class ProductStateController {
    @Autowired
    private ProductStateService productStateService;

    @GetMapping
    public ResponseVO getAll(){
        List<ProductState> productStateList = productStateService.getAll();
        return new ResponseVO(productStateList,"查询成功",2000);
    }
}
