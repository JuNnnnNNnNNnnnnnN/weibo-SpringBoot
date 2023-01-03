package com.weibo.controller;

import java.util.*;

import com.weibo.constants.ResultConstants;
import com.weibo.entity.Article;
import com.weibo.entity.Result;
import com.weibo.service.ArticleDbService;
import com.weibo.utils.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/articleAction")
public class ArticleAction {

    @Autowired
    Result result;

    @Autowired
    ArticleDbService articleDbService;

    @RequestMapping("/addArticle")
    @ResponseBody
    public Result addArticle(long userId, Article article){
        Result result = new Result();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
