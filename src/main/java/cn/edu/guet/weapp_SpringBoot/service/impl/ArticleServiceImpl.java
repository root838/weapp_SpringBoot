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
}
