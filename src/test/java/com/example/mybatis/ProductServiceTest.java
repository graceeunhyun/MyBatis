package com.example.mybatis;

import com.example.mybatis.model.Product;
import com.example.mybatis.service.ProductService;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void getProductById() {
        Product product = productService.getProductById(1L);
//        log.info("product : {}", product);
        System.out.println("product = " + product);
    }

    @Test
    public void getAllProducts() {
        List<Product> productList = productService.getAllProducts();
//        log.info("products : {}", productList);
        System.out.println("productList = " + productList);
    }

    @Transactional
    @Test
    public void addProduct() {
        productService.addProduct(new Product("쿤달 샴푸", 7900));
        productService.addProduct(new Product("마스크팩", 1000));
        productService.addProduct(new Product("티셔츠", 5900));
    }
}
