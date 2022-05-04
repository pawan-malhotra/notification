package com.giftcard.notification.controller;

import com.giftcard.notification.model.Mail;
import com.giftcard.notification.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @Autowired
    MailService mailService;

    @GetMapping("/notification")
    public String notificationHome() {
        Mail mail = new Mail();
        mail.setMailFrom("crazyforprogramming@gmail.com");
        mail.setMailTo("pawan7870260373@gmail.com");
        mail.setMailSubject("Increase Your CTC");
        mail.setMailContent("Hi,\nPooja Gujrathi\nWe have decided to increase your package from 3.5 Lpa to 6 Lpa as per your performance in internship. we appreciated your hard work and dedication toward our company. please send your feedback to us.\n Thanks & Regards\n Pawan Malhotra (Founder of Free File Converter & Error Overflow)");
        mailService.sendEmail(mail);
        return "send";
    }
}
