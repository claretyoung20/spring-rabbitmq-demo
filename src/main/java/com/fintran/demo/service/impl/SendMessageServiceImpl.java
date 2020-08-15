package com.fintran.demo.service.impl;

import com.fintran.demo.config.Constants;
import com.fintran.demo.domain.TransactionDTO;
import com.fintran.demo.service.SendMessageService;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class SendMessageServiceImpl implements SendMessageService {

    private final RabbitTemplate rabbitTemplate;
    @Override
    public void sendMessage(TransactionDTO transactionDTO) {
        rabbitTemplate.convertAndSend(Constants.TOPIC_EXCHANGE_NAME, "fin.tran.01", transactionDTO);
    }
}
