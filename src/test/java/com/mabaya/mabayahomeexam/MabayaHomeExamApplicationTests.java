package com.mabaya.mabayahomeexam;

import com.mabaya.mabayahomeexam.seller.SellerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MabayaHomeExamApplicationTests {

    @Autowired
    SellerService sellerService;

    @Test
    void contextLoads() {

    }

    @Test
    void runTestExample() {
        List<Object[]> sellers = sellerService.getAllSeller();
        for (Object[] seller : sellers) {
            System.out.println("id is " + seller[0] + " name is " + seller[1]);
        }
    }

}
