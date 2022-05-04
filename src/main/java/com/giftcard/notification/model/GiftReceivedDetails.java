package com.giftcard.notification.model;

import java.util.Date;

public class GiftReceivedDetails {
    private int giftReceivedId;
    private int userid;
    private int userGiftId;
    private Date giftReceivedDate;

    public GiftReceivedDetails(int giftReceivedId, int userid, int userGiftId, Date giftReceivedDate) {
        this.giftReceivedId = giftReceivedId;
        this.userid = userid;
        this.userGiftId = userGiftId;
        this.giftReceivedDate = giftReceivedDate;
    }

    public GiftReceivedDetails() {
    }

    public int getGiftReceivedId() {
        return giftReceivedId;
    }

    public void setGiftReceivedId(int giftReceivedId) {
        this.giftReceivedId = giftReceivedId;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getUserGiftId() {
        return userGiftId;
    }

    public void setUserGiftId(int userGiftId) {
        this.userGiftId = userGiftId;
    }

    public Date getGiftReceivedDate() {
        return giftReceivedDate;
    }

    public void setGiftReceivedDate(Date giftReceivedDate) {
        this.giftReceivedDate = giftReceivedDate;
    }
}
