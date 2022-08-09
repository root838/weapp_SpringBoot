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

    //下面是小程序接口
    //1.获取所有文章
    List<Article> getAllArticle();
    //2.模糊查询文章
    List<Article> searchArticle(String searchCondition);
    //3.根据文章类型获取文章列表
    List<Article> getArticleByType(String type);
}
