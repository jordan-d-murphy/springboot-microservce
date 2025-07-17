package com.example.demo;

import java.time.LocalDateTime;

public class FunFactResponse {
    private String fact;
    private LocalDateTime generatedAt;
    private String hostname;
    private String ip;
    private String error;

    public FunFactResponse(String fact, LocalDateTime generatedAt, String hostname, String ip, String error) {
        this.fact = fact;
        this.generatedAt = generatedAt;
        this.hostname = hostname;
        this.ip = ip;
        this.error = error;
    }

    public String getFact() {
        return fact;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
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
