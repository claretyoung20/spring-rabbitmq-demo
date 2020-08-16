package com.fintran.demo.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class TransactionDTO implements Serializable {
    private Long transactionId;
    private BigDecimal amount;
    private TransactionStatusConstant status;
    private LocalDate transactionDate;
    private String description;
    private String senderPersonName;
    private String transactionType;

}
