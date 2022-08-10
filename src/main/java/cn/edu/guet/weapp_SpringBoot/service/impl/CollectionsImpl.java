package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.Collections;
import cn.edu.guet.weapp_SpringBoot.mapper.CollectionsMapper;
import cn.edu.guet.weapp_SpringBoot.service.CollectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionsImpl implements CollectionsService {
    @Autowired
    private CollectionsMapper collectionsMapper;

    @Override
    public Collections ifUserCollectArticle(String open_id, String article_id) {
        return collectionsMapper.ifUserCollectArticle(open_id,article_id);
    }

    @Override
    public int insertUserCollectArticle(String id, String open_id, String article_id) {
        return collectionsMapper.insertUserCollectArticle(id, open_id, article_id);
    }

    @Override
    public int deleteUserCollectArticle(String open_id, String article_id) {
        return collectionsMapper.deleteUserCollectArticle(open_id, article_id);
    }
}
