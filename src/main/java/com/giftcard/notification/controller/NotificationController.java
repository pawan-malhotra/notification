package com.giftcard.notification.controller;

import com.giftcard.notification.model.GiftRedeemDetails;
import com.giftcard.notification.model.ResponseDto;
import com.giftcard.notification.model.User;
import com.giftcard.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @GetMapping("/notification/successfully-register")
    public ResponseEntity<ResponseDto> userSuccessfullyRegister() {
        // dummy user
        User user = new User("U101", "john", "wick", "pawan7870260373@gmail.com");
        User u = notificationService.user_successfully_registered(user);
        return new ResponseEntity<>(new ResponseDto("Send With Success!", HttpStatus.OK.value()), HttpStatus.OK);
    }

    @GetMapping("/notification/user-info-updated")
    public ResponseEntity<ResponseDto> userInfoUpdate() {
        // dummy user
        User user = new User("U101", "john", "wick", "pawan7870260373@gmail.com");
        User u = notificationService.user_info_update(user);
        return new ResponseEntity<>(new ResponseDto("Send With Success!", HttpStatus.OK.value()), HttpStatus.OK);
    }

    @GetMapping("/notification/not-login-from-long-time")
    public ResponseEntity<ResponseDto> haveNotLoginFromLongTime() {
        // dummy user
        User user = new User("U101", "john", "wick", "pawan7870260373@gmail.com");
        notificationService.user_haveNot_loginFrom_longTime(user);
        return new ResponseEntity<>(new ResponseDto("Send With Success!", HttpStatus.OK.value()), HttpStatus.OK);
    }

    @GetMapping("/notification/purchased-gift-card")
    public ResponseEntity<ResponseDto> purchasedGiftCard() {
        // dummy user
        User user = new User("U101", "john", "wick", "pawan7870260373@gmail.com");
        notificationService.purchased_eGift_card(user);
        return new ResponseEntity<>(new ResponseDto("Send With Success!", HttpStatus.OK.value()), HttpStatus.OK);
    }

    @GetMapping("/notification/notified-redeem-gift-card")
    public ResponseEntity<ResponseDto> notifiedRedeemGiftCard() {
        // dummy user
        User user = new User("U101", "john", "wick", "crazyforprogramming@gmail.com");
        // dummy gift redeem details
        GiftRedeemDetails details = new GiftRedeemDetails(1, false, new Date(), 22000, 33000, 1);
        notificationService.notified_redeem_eGiftCard(user);
        return new ResponseEntity<>(new ResponseDto("Send With Success!", HttpStatus.OK.value()), HttpStatus.OK);
    }

    @GetMapping("/notification/successfully-redeemed-gift-card")
    public ResponseEntity<ResponseDto> successfullyRedeemedGiftCard() {
        // dummy user
        User user = new User("U101", "john", "wick", "crazyforprogramming@gmail.com");
        // dummy gift redeem details
        GiftRedeemDetails details = new GiftRedeemDetails(1, false, new Date(), 22000, 33000, 1);
        notificationService.successfully_redeemed_eGiftCard(details,user);
        return new ResponseEntity<>(new ResponseDto("Send With Success!", HttpStatus.OK.value()), HttpStatus.OK);
    }

    @GetMapping("/notification/on-profile-update")
    public ResponseEntity<ResponseDto> onProfileUpdate() {
        // dummy user
        User user = new User("U101", "john", "wick", "pawan7870260373@gmail.com");
        User u = notificationService.onProfileUpdate(user);
        return new ResponseEntity<>(new ResponseDto("Send With Success!", HttpStatus.OK.value()), HttpStatus.OK);
    }

}
