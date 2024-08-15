package com.pastelaria.servicoemail.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pastelaria.servicoemail.entities.Email;
import com.pastelaria.servicoemail.service.EmailService;

@RestController
@RequestMapping("api/v1/email")
public class EmailController {

    private final EmailService service;

    public EmailController(EmailService service) {
        this.service = service;
    }

    @PostMapping
    public void enviarEmail(@RequestBody Email email){
        service.enviarEmail(email);
    }

}
