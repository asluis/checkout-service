package com.example.CheckoutService.api.service;

import com.example.CheckoutService.api.model.History;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.*;

import java.util.ArrayList;
import java.util.List;

public class HistoryRepositoryImpl implements HistoryRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<History> findBySellerID(String sellerID){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<History> query = cb.createQuery(History.class);
        Root<History> history = query.from(History.class);

        Path<String> sIDPath = history.get("sellerID");

        query.select(history).where(cb.equal(sIDPath, sellerID)); // is current sID equal to given sellerID?

        return entityManager.createQuery(query).getResultList();
    }

}
