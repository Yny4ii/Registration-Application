package com.example.userregistration.repository;

public interface EmailSender {
    void send(String to, String email);
}
