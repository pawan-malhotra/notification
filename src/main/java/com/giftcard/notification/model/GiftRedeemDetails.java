package com.giftcard.notification.model;

import java.util.Date;

public class GiftRedeemDetails {
    private int giftRedeemId;
    private boolean redeemStatus;
    private Date giftRedeemDate;
    private double giftRedeemAmount;
    private double balance;
    private int userGiftId;

    public GiftRedeemDetails(int giftRedeemId, boolean redeemStatus, Date giftRedeemDate, double giftRedeemAmount, double balance, int userGiftId) {
        this.giftRedeemId = giftRedeemId;
        this.redeemStatus = redeemStatus;
        this.giftRedeemDate = giftRedeemDate;
        this.giftRedeemAmount = giftRedeemAmount;
        this.balance = balance;
        this.userGiftId = userGiftId;
    }

    public GiftRedeemDetails() {
    }

    public int getGiftRedeemId() {
        return giftRedeemId;
    }

    public void setGiftRedeemId(int giftRedeemId) {
        this.giftRedeemId = giftRedeemId;
    }

    public boolean isRedeemStatus() {
        return redeemStatus;
    }

    public void setRedeemStatus(boolean redeemStatus) {
        this.redeemStatus = redeemStatus;
    }

    public Date getGiftRedeemDate() {
        return giftRedeemDate;
    }

    public void setGiftRedeemDate(Date giftRedeemDate) {
        this.giftRedeemDate = giftRedeemDate;
    }

    public double getGiftRedeemAmount() {
        return giftRedeemAmount;
    }

    public void setGiftRedeemAmount(double giftRedeemAmount) {
        this.giftRedeemAmount = giftRedeemAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getUserGiftId() {
        return userGiftId;
    }

    public void setUserGiftId(int userGiftId) {
        this.userGiftId = userGiftId;
    }
}
