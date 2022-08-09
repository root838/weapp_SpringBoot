package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.Article;
import cn.edu.guet.weapp_SpringBoot.mapper.ArticleMapper;
import cn.edu.guet.weapp_SpringBoot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper aricleMapper;

    @Override
    public List<Article> getAricleList() {

        return aricleMapper.getArticleList();
    }

    @Override
    public String getAricleContent(String id) {
        return aricleMapper.getArticleContent(id);
    }

    @Override
    public int newAricle(Article aricle) {
        return aricleMapper.newArticle(aricle);
    }

    @Override
    public int updataAricle(Article aricle) {
        return aricleMapper.updataArticle(aricle);
    }

    @Override
    public int deleteAricle(String id) {
        return aricleMapper.deleteArtilce(id);
    }


    /*
        下面是有关小程序的接口
       1.查询所有文章 ：/getAllArticle
       2.用户输入搜索框,模糊查询 ：/searchArticle
       3.根据特定文章类型查询所有文章 ：/getArticleByType
    */
    // 1.查询所有文章 ：/getAllArticle
    @Override
    public List<Article> getAllArticle() {
        return aricleMapper.getAllArticle();
    }

    //2.模糊查询文章 ：/searchArticle
    @Override
    public List<Article> searchArticle(String searchCondition) {
        return aricleMapper.searchArticle(searchCondition);
    }

    //3.根据文章类型获取文章列表
    public List<Article> getArticleByType(String type) {
        return aricleMapper.getArticleByType(type);
    }
}
