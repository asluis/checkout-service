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
        CriteriaBuilder cb = entityManager.getCriteriaBuilder(); // gets query builder

        CriteriaQuery<History> query = cb.createQuery(History.class); // create query
        Root<History> history = query.from(History.class); // specify class / table we want to look at

        Path<String> sIDPath = history.get("sellerID"); // grab sellerID column

        query.select(history).where(cb.equal(sIDPath, sellerID)); // is current sID equal to given sellerID?

        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<History> findByBuyerID(String buyerID){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<History> query = cb.createQuery(History.class);
        Root<History> history = query.from(History.class);

        Path<String> bIDPath = history.get("buyerID");

        query.select(history).where(cb.equal(bIDPath, buyerID));

        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<History> findByListingTitle(String title){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<History> query = cb.createQuery(History.class);
        Root<History> history = query.from(History.class);

        Path<String> titlePath = history.get("title");

        query.select(history).where(cb.like(titlePath, title));

        return entityManager.createQuery(query).getResultList();
    }

}
