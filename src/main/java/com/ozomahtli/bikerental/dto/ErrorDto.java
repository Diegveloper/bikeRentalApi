package com.ozomahtli.bikerental.dto;

import java.util.List;

public class ErrorDto {
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Object> getMessages() {
        return messages;
    }

    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    private int status;
    private String error;
    private List<Object> messages;

    public ErrorDto(int status, String error, List<Object> messages) {
        this.status = status;
        this.error = error;
        this.messages = messages;
    }

}
