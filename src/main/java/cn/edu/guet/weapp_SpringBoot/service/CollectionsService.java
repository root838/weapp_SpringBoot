package cn.edu.guet.weapp_SpringBoot.service;


import cn.edu.guet.weapp_SpringBoot.bean.Article;
import cn.edu.guet.weapp_SpringBoot.bean.Collections;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CollectionsService {
    Collections ifUserCollectArticle(String open_id,String article_id);

    int insertUserCollectArticle(String id,String open_id,String article_id);

    int deleteUserCollectArticle(String open_id,String article_id);

    List<Article> getAllArticleUserCollected(String open_id);
}
