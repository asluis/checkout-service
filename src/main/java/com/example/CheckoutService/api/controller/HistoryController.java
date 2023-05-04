package com.example.CheckoutService.api.controller;

import com.example.CheckoutService.api.model.History;
import com.example.CheckoutService.api.service.HistoryService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HistoryController {

    private HistoryService histService;

    @Autowired
    public HistoryController(HistoryService service){
        this.histService = service;
    }

    @GetMapping("/history")
    public History getHistory(@RequestParam(value = "userID", defaultValue = "") String userID){
        Optional user = histService.getHistory(userID);
        return (History) user.get();
    }

}
