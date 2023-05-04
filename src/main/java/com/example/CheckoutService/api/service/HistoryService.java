package com.example.CheckoutService.api.service;

import com.example.CheckoutService.api.model.History;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class HistoryService {

    private History temp = new History("TESTID", "TESTSELLERID", "TESTITLE", 101, 1);

    public HistoryService(){

    }

    public Optional<History> getHistory(String buyerID){
        Optional opt = Optional.empty();

        opt = Optional.of(temp);
        return opt;
    }


}
