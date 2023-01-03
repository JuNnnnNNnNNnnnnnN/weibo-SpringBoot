package com.weibo.dao;

import com.weibo.entity.Article;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.*;

@Mapper
@Repository
public interface ArticleDao {

    @Insert("insert into article values ()")
    void insertArticle(long userId, Article article);

    @Select("select * from tbl_article")
    void selectAllArticle();

    @Select("select title,createDate from article order by (subsNum + commentNum) DESC limit 20")
    List<Article> selectHot20Article();

    @Select("")
    List<Article> selectArticleWithKey();
}
