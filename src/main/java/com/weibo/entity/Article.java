package com.weibo.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Article {

    private long articleId;

    private long userId;

    private String title;

    private String contentPath;

    private Date createDate;

    private int subsNum;

    private String[] subsUserId;

    private int commentNum;

    private String[] commentUserId;

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentPath() {
        return contentPath;
    }

    public void setContentPath(String contentPath) {
        this.contentPath = contentPath;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getSubsNum() {
        return subsNum;
    }

    public void setSubsNum(int subsNum) {
        this.subsNum = subsNum;
    }

    public String[] getSubsUserId() {
        return subsUserId;
    }

    public void setSubsUserId(String[] subsUserId) {
        this.subsUserId = subsUserId;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public String[] getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(String[] commentUserId) {
        this.commentUserId = commentUserId;
    }
}
