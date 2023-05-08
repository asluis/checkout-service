package com.example.CheckoutService.api.service;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.CheckoutService.api.model.History;

import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called HistoryRepository
// CRUD refers Create, Read, Update, Delete

public interface HistoryRepository extends CrudRepository<History, Integer>{

    @Query("SELECT hist FROM history hist WHERE hist.sellerID = ?1")
    List<History> findBySellerID(String sellerID);

    @Query("SELECT hist FROM history hist WHERE hist.buyerID= ?1")
    List<History> findByBuyerID(String buyerID);

    @Query("SELECT hist FROM history hist WHERE hist.listingTitle LIKE %?1%")
    List<History> findByListingTitle(String listingTitle);
}
