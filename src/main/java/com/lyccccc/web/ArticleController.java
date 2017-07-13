package com.lyccccc.web;

import com.lyccccc.dao.BlogArticleDao;
import com.lyccccc.model.BlogArticle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Liuyuchen on 2017/07/13.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private BlogArticleDao blogArticleDao;
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addArticle(@RequestParam("articleName") String articleName){
        System.out.println(articleName);
        System.out.println(blogArticleDao);
        BlogArticle blogArticle = new BlogArticle();
        blogArticle.setArticleName(articleName);
        blogArticle.setCreateTime(null);
        blogArticle.setUpdateTime(null);
        blogArticle.setContextPath("12331312");
        blogArticleDao.save(blogArticle);
    }
}
