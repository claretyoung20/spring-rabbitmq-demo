package com.fintran.demo.service;

import com.fintran.demo.domain.TransactionDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageReceiveHandler {

    private final TransactionService transactionService;

    public void handleMessage(TransactionDTO transactionDTO) {
        transactionService.createTransaction(transactionDTO);
    }
}

