package com.example.demo;

import java.time.LocalDateTime;

public class HelloResponse {
    private String message;
    private LocalDateTime timestamp;
    private String hostname;
    private String ip;
    private String error;


    public HelloResponse(String message, LocalDateTime timestamp, String hostname, String ip, String error) {
        this.message = message;
        this.timestamp = timestamp;
        this.hostname = hostname;
        this.ip = ip;
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getHostname() {
        return hostname;
    }

    public String getIp() {
        return ip;
    }

    public String getError() {
        return error;
    }
}
