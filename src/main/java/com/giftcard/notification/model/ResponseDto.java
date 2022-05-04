package com.giftcard.notification.model;

public class ResponseDto {
    private String message;
    private int status;

    public ResponseDto(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public ResponseDto() {
    }
}
