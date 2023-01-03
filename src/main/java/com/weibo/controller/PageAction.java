package com.weibo.controller;

import com.weibo.entity.Article;
import com.weibo.service.ArticleDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;


@Controller
@RequestMapping("/pageAction")
public class PageAction {

    @Autowired
    ArticleDbService articleDbService;

    //首页拉取热门文章
    @RequestMapping("/hotpot")
    public List<Article> getHotPot (){
        List<Article> hot20Article = articleDbService.selectHot20Article();
        return  hot20Article;
    }

    //搜索文章


}
