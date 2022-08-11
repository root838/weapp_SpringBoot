package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.bean.Article;
import cn.edu.guet.weapp_SpringBoot.bean.Collections;
import cn.edu.guet.weapp_SpringBoot.service.CollectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("collections")
public class CollectionsController {

    @Autowired
    private CollectionsService collectionsService;

    /*
        1.用户对文章的收藏(两个接口) ： /collections
        1.1：查看当前用户对当前文章是否已经收藏：/ifUserCollectArticle  --- boolean
        1.2：对前端用户收藏/取消收藏文章时间进行事务处理：/solveCollection
    */

    @GetMapping("/ifUserCollectArticle")
    public boolean ifUserCollectArticle(String open_id,String article_id){
        Collections collections = collectionsService.ifUserCollectArticle(open_id, article_id);
        if (collections!=null){
            return true;
        }else {
            return false;
        }
    }

    @GetMapping("/solveCollection")
    public String solveCollection(boolean value,String open_id,String article_id) {
        //System.out.println("value = " + value);
        //System.out.println("open_id = " + open_id);
        //System.out.println("article_id = " + article_id);
        if (value){
            //如果是收藏事件,则insert插入新的用户-文章收藏记录
            String id = UUID.randomUUID().toString().replaceAll("-","");//生成UUID赋值给collections表的id字段
            if (collectionsService.insertUserCollectArticle(id,open_id,article_id)>0){
                return "已成功收藏";
            }
            return "已经收藏过了，不用再收藏了";
        }else{
            //如果是取消收藏事件,则delete删除该记录
            if (collectionsService.deleteUserCollectArticle(open_id,article_id)>0){
                return "已取消收藏";
            }
            return "已经取消过了，不用再取消了";
        }
    }

    @GetMapping("/getAllArticleUserCollected")
    public List<Article> getAllArticleUserCollected(String open_id){
        return collectionsService.getAllArticleUserCollected(open_id);
    }
}
