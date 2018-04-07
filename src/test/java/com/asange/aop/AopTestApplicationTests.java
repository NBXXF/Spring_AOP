package com.asange.aop;

import com.asange.aop.security.CurrentSetHolder;
import com.asange.aop.service.ProductService;
import com.asange.aop.service.ProductService2;
import com.asange.aop.service.ProductService3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopTestApplicationTests {


    @Autowired
    ProductService3 productService;

    @Test
    public void testInsert() {
        CurrentSetHolder.set("admin");
        productService.insert();
    }

}
