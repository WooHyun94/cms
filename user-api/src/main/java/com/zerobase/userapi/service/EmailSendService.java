package com.zerobase.userapi.service;

import com.zerobase.userapi.client.MailgunClient;
import com.zerobase.userapi.client.mailgun.SendMailForm;
import feign.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSendService {
    private final MailgunClient mailgunClient;

    public String sendEmail() {
        SendMailForm form = SendMailForm.builder()
                                        .from("zerobase.my.com")
                                        .to("94dngus@gmail.com")
                                        .subject("test")
                                        .text("test email")
                                        .build();
        return mailgunClient.sendEmail(form).getBody();
    }
}
