package cn.edu.guet.weapp_SpringBoot.service;

import cn.edu.guet.weapp_SpringBoot.bean.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAricleList();
    String getAricleContent(String id);
    int newAricle(Article aricle);
    int updataAricle(Article aricle);
    int deleteAricle(String id);
}
