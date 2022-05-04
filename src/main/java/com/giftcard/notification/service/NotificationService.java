package com.giftcard.notification.service;

import com.giftcard.notification.model.GiftRedeemDetails;
import com.giftcard.notification.model.ResponseDto;
import com.giftcard.notification.model.User;

public interface NotificationService {
    User user_successfully_registered(User user);
    User user_info_update(User user);
    void user_haveNot_loginFrom_longTime(User user);
    void purchased_eGift_card(User user);
    void notified_redeem_eGiftCard(User user);
    User onProfileUpdate(User user);
    GiftRedeemDetails successfully_redeemed_eGiftCard(GiftRedeemDetails giftRedeemDetails, User user);
}
