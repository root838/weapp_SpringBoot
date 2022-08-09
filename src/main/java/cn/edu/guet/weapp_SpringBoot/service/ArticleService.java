package cn.edu.guet.weapp_SpringBoot.service;

import cn.edu.guet.weapp_SpringBoot.bean.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getAricleList();
    String getAricleContent(String id);
    int newAricle(Article aricle);
    int updataAricle(Article aricle);
    int deleteAricle(String id);

    //下面是小程序，有关业务层的接口
    //1.查询所有文章
    List<Article> getAllArticle();
    //2.模糊查询文章
    List<Article> searchArticle(String searchCondition);
    //3.根据文章类型获取文章列表
    List<Article> getArticleByType(String type);
}
