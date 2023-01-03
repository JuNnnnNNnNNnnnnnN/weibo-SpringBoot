package com.weibo.service.impl;

import com.weibo.constants.ResultConstants;
import com.weibo.dao.ArticleDao;
import com.weibo.entity.Article;
import com.weibo.entity.Result;
import com.weibo.service.ArticleDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ArticleDbServiceImpl implements ArticleDbService {

    @Autowired
     ArticleDao articleDao;

    @Override
    public Result saveAddedArticleByUserId(long userId, Article article) {
        Result result = new Result();
        try {
            articleDao.insertArticle(userId, article);
            result.success();
        } catch (Exception e) {
            result.fail();
        }
        return result;
    }

    @Override
    public Result selectAllArticle() {
        Result result = new Result();
        try {
            articleDao.selectAllArticle();
        } catch (Exception e) {
            result.fail();
        }
        return result;
    }

    @Override
    public List<Article> selectHot20Article() {
        List<Article> hot20ArticleList = articleDao.selectHot20Article();
        try {
            articleDao.selectHot20Article();
        } catch (Exception e) {

        }
        return hot20ArticleList;
    }
}
