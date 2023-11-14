package com.zerobase.userapi.service;

import feign.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailSendServiceTest {
    @Autowired
    private EmailSendService emailSendService;


    @Test
    public void sendEmail() {
        String  reponse = emailSendService.sendEmail();
        System.out.println(reponse);
    }
}