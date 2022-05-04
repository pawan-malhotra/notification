package com.giftcard.notification.service;

import com.giftcard.notification.model.Mail;
import org.springframework.stereotype.Service;

public interface MailService {
   void sendEmail(Mail mail);
}
