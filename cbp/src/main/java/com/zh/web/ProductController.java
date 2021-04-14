package com.zh.web;

import com.github.pagehelper.PageInfo;
import com.zh.po.Product;
import com.zh.service.ProductService;
import com.zh.web.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/page/{pageNum}/{pageSize}")
    public ResponseVO<PageInfo<Product>> page(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        PageInfo<Product> products = productService.findAllProduct(pageNum, pageSize);
        return new ResponseVO<>(products,"查询成功",2000);
    }
    @GetMapping("/page/{pageNum}/{pageSize}/{productState}")
    public ResponseVO<PageInfo<Product>> page(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable Integer productState){
        PageInfo<Product> products = productService.findProductByState(pageNum, pageSize,productState);
        return new ResponseVO<>(products,"查询成功",2000);
    }
    @PostMapping
    public ResponseVO addProduct(@RequestBody Product product){
        Integer row = productService.addProduct(product);
        if (row>0){
            return new ResponseVO<>(row,"新增成功",2000);
        }else {
            return new ResponseVO<>(null,"新增失败",4000);
        }
    }

    @GetMapping("/{productId}")
    public ResponseVO<Product> findProductById(@PathVariable Integer productId){
        Product product = productService.getProductById(productId);
        if (product != null){
            return new ResponseVO<>(product,"查询成功",2000);
        }else {
            return new ResponseVO<>(null,"查询失败",4000);
        }
    }

    @DeleteMapping
    public ResponseVO deleteProduct(@RequestBody Integer[] ids){
        for (Integer id : ids) {
            Integer row = productService.deleteProducts(id);
            if (row >0){
                return new ResponseVO<>(row,"删除成功",2000);
            }
        }
        return new ResponseVO<>(null,"删除失败",4000);
    }

    @PutMapping
    public ResponseVO updateProduct(@RequestBody Product product){
        Integer row = productService.updateProduct(product);
        if (row >0 ){
            return new ResponseVO<>(row,"修改成功",2000);
        }
        return new ResponseVO<>(null,"修改失败",4000);
    }

}
