package com.fintran.demo.service;

import com.fintran.demo.config.Constants;
import com.fintran.demo.domain.TransactionDTO;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageReceiveHandler {

    private final TransactionService transactionService;

//    @RabbitListener(queues = Constants.QUEUE_NAME)
    public void handleMessage(TransactionDTO transactionDTO) {
        transactionService.createTransaction(transactionDTO);
    }
}

