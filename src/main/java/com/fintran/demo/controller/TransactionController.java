package com.fintran.demo.controller;

import com.fintran.demo.controller.response.ApiResponse;
import com.fintran.demo.domain.TransactionDTO;
import com.fintran.demo.service.SendMessageService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class TransactionController {

   private SendMessageService sendMessageService;

    @PostMapping("/send")
    public ResponseEntity<ApiResponse<?>> sendMessage(@RequestBody TransactionDTO transactionDTO) {
        sendMessageService.sendMessage(transactionDTO);
        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse<>(HttpStatus.OK.value(), "message sent"));
    }
}
