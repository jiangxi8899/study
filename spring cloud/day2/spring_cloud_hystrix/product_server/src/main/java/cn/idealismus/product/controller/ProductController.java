package cn.idealismus.product.controller;

import cn.idealismus.product.entity.Product;
import cn.idealismus.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @Value("${server.port}")
    private String port;
    
    @Value("${spring.cloud.client.ip-address}")
    private String ip;
    
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Product finById (@PathVariable Integer id) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Product product = productService.getProductById(id);
        return product;
    }
    
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String save(@RequestBody Product product){
        productService.save(product);
        return "保存成功";
    }
}
