package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.bean.Article;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("aricle")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PreAuthorize("hasAuthority('sys:aricle:view')")
    @GetMapping(value = "/getAricleList")
    public HttpResult getAricleList() {
        System.out.println("查找文章列表" );
        List<Article> aricleList = articleService.getAricleList();
        return HttpResult.ok(aricleList);
    }

    @PreAuthorize("hasAuthority('sys:aricle:view')")
    @GetMapping(value = "/getAricleContent")
    public HttpResult getAricleContent(String id) {
        System.out.println("查找文章内容" );
        String content=articleService.getAricleContent(id);
        List<String> contentlist=new ArrayList<>();
        contentlist.add(content);
        System.out.println(content);
        return HttpResult.ok(contentlist);
    }

    @PreAuthorize("hasAuthority('sys:aricle:view')")
    @GetMapping(value = "/deleteAricle")
    public int deleteAricle(String id) {
        System.out.println("删除文章" );
        return articleService.deleteAricle(id);
    }

    @PreAuthorize("hasAuthority('sys:aricle:view')")
    @GetMapping(value = "/newAricle")
    public int newAricle(String id,String title,String type,String content) {
        System.out.println(id);
        System.out.println(title);
        System.out.println(type);
        System.out.println(content);
        long currentTime = System.currentTimeMillis();
        Timestamp nowTime = new Timestamp(currentTime);
        System.out.println("时间"+nowTime);
        Article aricle=new Article();
        aricle.setId(id);
        aricle.setType(type);
        aricle.setContent(content);
        aricle.setTitle(title);
        aricle.setTime(nowTime);
        aricle.setImg("/src/main/resources/images/"+id+".png");
        System.out.println("时间1："+aricle.getTime());
        return articleService.newAricle(aricle);
    }

    @PreAuthorize("hasAuthority('sys:aricle:view')")
    @GetMapping(value = "/updataAricle")
    public int updataAricle(String id,String title,String type,String content) {
        System.out.println(id);
        System.out.println(title);
        System.out.println(type);
        System.out.println(content);
        long currentTime = System.currentTimeMillis();
        Timestamp nowTime = new Timestamp(currentTime);
        Article aricle=new Article();
        aricle.setId(id);
        aricle.setType(type);
        aricle.setContent(content);
        aricle.setTitle(title);
        aricle.setTime(nowTime);
        aricle.setImg("/src/main/resources/images/"+id+".png");
        return articleService.updataAricle(aricle);
    }
}
