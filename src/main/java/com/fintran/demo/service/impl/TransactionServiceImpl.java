package com.fintran.demo.service.impl;

import com.fintran.demo.domain.TransactionDTO;
import com.fintran.demo.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Override
    public void createTransaction(TransactionDTO transactionDTO) {
        /** Save to DB or do something*/
        System.out.println("transaction details: " + transactionDTO.toString());
    }
}
