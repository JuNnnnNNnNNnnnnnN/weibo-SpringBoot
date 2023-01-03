package com.weibo.entity;

import org.springframework.stereotype.Component;

import java.io.File;
import java.util.Date;

@Component
public class User {

    private long userId;

    private Date registerDate;

    private String userName;

    private boolean isMale;

    private String HeadPhotoFilePath;

    private int articleNum;

    private int getSubsNum;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getHeadPhotoFilePath() {
        return HeadPhotoFilePath;
    }

    public void setHeadPhotoFilePath(String headPhotoFilePath) {
        HeadPhotoFilePath = headPhotoFilePath;
    }

    public int getArticleNum() {
        return articleNum;
    }

    public void setArticleNum(int articleNum) {
        this.articleNum = articleNum;
    }

    public int getGetSubsNum() {
        return getSubsNum;
    }

    public void setGetSubsNum(int getSubsNum) {
        this.getSubsNum = getSubsNum;
    }
}
