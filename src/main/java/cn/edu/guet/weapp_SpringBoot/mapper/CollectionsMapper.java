package cn.edu.guet.weapp_SpringBoot.mapper;

import cn.edu.guet.weapp_SpringBoot.bean.Collections;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CollectionsMapper {
    Collections ifUserCollectArticle(@Param("open_id") String open_id, @Param("article_id")String article_id);

    int insertUserCollectArticle(@Param("id")String id,@Param("open_id")String open_id,@Param("article_id")String article_id);

    int deleteUserCollectArticle(@Param("open_id")String open_id,@Param("article_id")String article_id);
}
