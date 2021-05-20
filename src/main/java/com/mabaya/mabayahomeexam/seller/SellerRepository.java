package com.mabaya.mabayahomeexam.seller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller, Long> {

    @Query(value = "select id, name from seller", nativeQuery = true)
    List<Object[]> findAllSellers();

}
