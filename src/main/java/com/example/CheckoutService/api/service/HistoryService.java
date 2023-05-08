package com.example.CheckoutService.api.service;

import com.example.CheckoutService.api.model.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService{

    @Autowired
    private HistoryRepository histRepo;

    public History save(History history) {
        return histRepo.save(history);
    }

    public History findByID(long id){
        return histRepo.findById(id).get();
    }

    public List<History> findBySellerID(String sellerID) {
        return null;
    }

    public List<History> findByBuyerID(String buyerID) {
        return null;
    }

    public List<History> findByListingTitle(String listingTitle) {
        return null;
    }
}
