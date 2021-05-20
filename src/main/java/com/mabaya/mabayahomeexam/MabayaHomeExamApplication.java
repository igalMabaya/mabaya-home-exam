package com.mabaya.mabayahomeexam;

import com.mabaya.mabayahomeexam.campaign.Campaign;
import com.mabaya.mabayahomeexam.campaign.CampaignRepository;
import com.mabaya.mabayahomeexam.seller.Seller;
import com.mabaya.mabayahomeexam.seller.SellerRepository;
import com.mabaya.mabayahomeexam.seller.SellerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MabayaHomeExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(MabayaHomeExamApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(CampaignRepository campaignRepository, SellerRepository sellerRepository, SellerService sellerService) {
        return (args) -> {
            sellerRepository.save(new Seller(1L, "first"));
            sellerRepository.save(new Seller(2L, "second"));
            sellerRepository.save(new Seller(3L, "third"));
            sellerRepository.save(new Seller(4L, "forth"));
            sellerRepository.save(new Seller(5L, "fifth"));
            sellerRepository.save(new Seller(6L, "sixth"));
            sellerRepository.save(new Seller(7L, "seventh"));

            campaignRepository.save(new Campaign(1L, "shoes", sellerRepository.getOne(1L)));
            campaignRepository.save(new Campaign(2L, "shirts", sellerRepository.getOne(1L)));
            campaignRepository.save(new Campaign(3L, "hats", sellerRepository.getOne(2L)));
            campaignRepository.save(new Campaign(4L, "sung", sellerRepository.getOne(3L)));
            campaignRepository.save(new Campaign(5L, "ali", sellerRepository.getOne(4L)));

            //call here for your methods
        };
    }
}
