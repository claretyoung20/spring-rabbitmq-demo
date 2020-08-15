package com.fintran.demo.controller.response;

import lombok.Data;

@Data
public class ApiResponse<T> {
    private String status;
    private String message;
    private Integer code;
    private T data;

    public ApiResponse(int code, String message, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public ApiResponse(int code, String message) {
        this.message = message;
        this.code = code;
    }

    public ApiResponse() {
    }
}
