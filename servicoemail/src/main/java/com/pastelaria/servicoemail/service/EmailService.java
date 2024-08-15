package com.pastelaria.servicoemail.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.pastelaria.servicoemail.entities.Email;

@Service
public class EmailService {
    
    private final JavaMailSender mailSender;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void enviarEmail(Email email){
        var mensagem = new SimpleMailMessage();

        mensagem.setFrom("noreply@gmail.com");
        mensagem.setTo(email.to());
        mensagem.setSubject(email.subject());
        mensagem.setText(email.body());
        mailSender.send(mensagem);

    }
}
