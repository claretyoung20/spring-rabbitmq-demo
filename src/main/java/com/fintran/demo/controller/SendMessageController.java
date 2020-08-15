package com.fintran.demo.controller;

import com.fintran.demo.config.Constants;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class SendMessageController {
    private final RabbitTemplate rabbitTemplate;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        rabbitTemplate.convertAndSend(Constants.TOPIC_EXCHANGE_NAME, "fin.tran.01", message);
        return "Message sent: " + message;
    }
}
