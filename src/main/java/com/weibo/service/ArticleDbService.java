package com.weibo.service;

import com.weibo.entity.Article;
import com.weibo.entity.Result;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticleDbService {

    Result saveAddedArticleByUserId(long UserId, Article article);

    Result selectAllArticle();

    List<Article> selectHot20Article();
}
