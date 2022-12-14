package cn.edu.guet.weapp_SpringBoot.mapper;

import cn.edu.guet.weapp_SpringBoot.bean.Article;
import cn.edu.guet.weapp_SpringBoot.bean.Collections;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CollectionsMapper {
    Collections ifUserCollectArticle(@Param("open_id") String open_id, @Param("article_id")String article_id);

    int insertUserCollectArticle(@Param("id")String id,@Param("open_id")String open_id,@Param("article_id")String article_id);

    int deleteUserCollectArticle(@Param("open_id")String open_id,@Param("article_id")String article_id);

    List<Article> getAllArticleUserCollected(String open_id);

    List<Article> searchCollection(String searchCondition,String open_id);
}
