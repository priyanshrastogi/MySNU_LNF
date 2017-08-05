package com.priyanshrastogi.mysnu_lnf;

public class Item {
    private String userName;
    private String userMail;
    private String itemTitle;
    private String itemDisc;
    private String postTime;

    public Item(String userName, String userMail, String itemTitle, String itemDisc, String postTime) {
        this.userName = userName;
        this.userMail = userMail;
        this.itemTitle = itemTitle;
        this.itemDisc = itemDisc;
        this.postTime = postTime;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public String getItemDisc() {
        return itemDisc;
    }

    public String getPostTime() {
        return postTime;
    }
}
