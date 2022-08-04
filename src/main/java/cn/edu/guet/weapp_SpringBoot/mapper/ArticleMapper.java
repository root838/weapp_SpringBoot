package cn.edu.guet.weapp_SpringBoot.mapper;

import cn.edu.guet.weapp_SpringBoot.bean.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper {
    List<Article> getArticleList();
    String getArticleContent(String id);
    int newArticle(Article aricle);
    int updataArticle(Article aricle);
    int deleteArtilce(String id);
}
