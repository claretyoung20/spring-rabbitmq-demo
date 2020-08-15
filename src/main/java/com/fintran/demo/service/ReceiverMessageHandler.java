package com.fintran.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReceiverMessageHandler {

    public void handleMessage(String messageBody) {
        log.info("handleMessage!!!");
        log.info(messageBody);
    }
}

