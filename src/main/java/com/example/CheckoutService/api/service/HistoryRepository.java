package com.example.CheckoutService.api.service;

import org.springframework.data.repository.CrudRepository;
import com.example.CheckoutService.api.model.History;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface HistoryRepository extends CrudRepository<History, Integer>{
}
