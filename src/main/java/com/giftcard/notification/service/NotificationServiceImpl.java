package com.giftcard.notification.service;

import com.giftcard.notification.model.GiftRedeemDetails;
import com.giftcard.notification.model.Mail;
import com.giftcard.notification.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService{

    @Autowired
    MailService mailService;

    @Override
    public User user_successfully_registered(User user) {
        Mail mail = new Mail();
        mail.setMailFrom("crazyforprogramming@gmail.com");
        mail.setMailTo(user.getEmail());
        mail.setMailSubject("E-Gift Card");
        String sb = "Welcome " +
                user.getFirstName() +
                "\n" +
                " To E-Gift Card\n" +
                "You're all set. Thank you for choosing E-Gift Card.Now you can gift card to your loved once.\n" +
                "login to your account & send E-Gift Cards!\n" +
                "Thanks & Regards\n" +
                "E-Gift Card";
        mail.setMailContent(sb);
        mailService.sendEmail(mail);
        return user;
    }

    @Override
    public User user_info_update(User user) {
        Mail mail = new Mail();
        mail.setMailFrom("crazyforprogramming@gmail.com");
        mail.setMailTo(user.getEmail());
        mail.setMailSubject("E-Gift Card");
        String sb = "Hi,\n " +
                user.getFirstName() +
                "\n" +
                " You have successfully updated your personal information. now you are good to go.\n" +
                "Thanks & Regards\n" +
                "E-Gift Card";
        mail.setMailContent(sb);
        mailService.sendEmail(mail);
        return user;
    }

    @Override
    public void user_haveNot_loginFrom_longTime(User user) {
        Mail mail = new Mail();
        mail.setMailFrom("crazyforprogramming@gmail.com");
        mail.setMailTo(user.getEmail());
        mail.setMailSubject("E-Gift Card");
        String sb = "Hi,\n " +
                user.getFirstName() +
                "\n" +
                "You have not visited your E-Gift Card from a long time. we have amazing offers for you. you will enjoy our offers & discount.\n" +
                "login to your account & grab the offer!\n" +
                "Thanks & Regards\n" +
                "E-Gift Card";
        mail.setMailContent(sb);
        mailService.sendEmail(mail);
    }

    @Override
    public void purchased_eGift_card(User user) {
        Mail mail = new Mail();
        mail.setMailFrom("crazyforprogramming@gmail.com");
        mail.setMailTo(user.getEmail());
        mail.setMailSubject("E-Gift Card");
        String sb = "Hi,\n " +
                user.getFirstName() +
                "\n" +
                "Thank you for purchasing gift card from E-Gift Card.\n" +
                "login to your account & grab the offer!\n" +
                "Thanks & Regards\n" +
                "E-Gift Card";
        mail.setMailContent(sb);
        mailService.sendEmail(mail);
    }

    @Override
    public void notified_redeem_eGiftCard(User user) {
        Mail mail = new Mail();
        mail.setMailFrom("crazyforprogramming@gmail.com");
        mail.setMailTo(user.getEmail());
        mail.setMailSubject("E-Gift Card");
        String sb = "Hi,\n " +
                user.getFirstName() +
                "\n" +
                "Thank you for purchasing gift card from E-Gift Card. Your gift cards are waiting in your wallet. Redeem your gift card.\n" +
                "login to your account & grab the offer!\n" +
                "Thanks & Regards\n" +
                "E-Gift Card";
        mail.setMailContent(sb);
        mailService.sendEmail(mail);
    }

    @Override
    public GiftRedeemDetails successfully_redeemed_eGiftCard(GiftRedeemDetails giftRedeemDetails, User user) {
        Mail mail = new Mail();
        mail.setMailFrom("crazyforprogramming@gmail.com");
        mail.setMailTo(user.getEmail());
        mail.setMailSubject("E-Gift Card");
        String sb = "Hi,\n" +
                user.getFirstName() +
                "\n" +
                "Your gift card has been successfully redeemed.\n" +
                "Details Of your Gift cards : \n" +
                "Gift Redeem Amount : "+giftRedeemDetails.getGiftRedeemAmount() + "\n" +
                "Gift Redeem Date : "+giftRedeemDetails.getGiftRedeemDate() + "\n" +
                "Gift Redeem Balance : "+giftRedeemDetails.getBalance() + "\n" +
                "login to your account & grab the offer!\n" + "\n" +
                "Thanks & Regards\n" +
                "E-Gift Card";
        mail.setMailContent(sb);
        mailService.sendEmail(mail);
        return giftRedeemDetails;
    }

    @Override
    public User onProfileUpdate(User user) {
        Mail mail = new Mail();
        mail.setMailFrom("crazyforprogramming@gmail.com");
        mail.setMailTo(user.getEmail());
        mail.setMailSubject("E-Gift Card");
        String sb = "Hi,\n " +
                user.getFirstName() +
                "\n" +
                " You have successfully updated your profile information. now you are good to go.\n" +
                "Thanks & Regards\n" +
                "E-Gift Card";
        mail.setMailContent(sb);
        mailService.sendEmail(mail);
        return user;
    }
}
