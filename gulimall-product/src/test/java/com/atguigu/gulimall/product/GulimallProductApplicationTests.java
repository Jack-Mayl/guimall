package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.domain.Brand;
import com.atguigu.gulimall.product.service.IBrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class GulimallProductApplicationTests {

    @Autowired
    private IBrandService iBrandService;


    @Test
    void contextLoads() {
        Brand brand = new Brand();
        brand.setName("华为");
        iBrandService.insertBrand(brand);
        System.out.println("保存成功....");
    }

}
