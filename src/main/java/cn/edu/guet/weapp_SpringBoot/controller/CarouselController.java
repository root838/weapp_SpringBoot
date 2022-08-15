package cn.edu.guet.weapp_SpringBoot.controller;



import cn.edu.guet.weapp_SpringBoot.bean.LoopImg;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.mapper.SysCarouselMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;


@RestController
public class CarouselController {
    private String filePath  = "/root/image/";
    private String fileName = "";
    private String baseUrl="http://47.95.223.172/image/";
    private String src = "";
    @Autowired
    private SysCarouselMapper sysCarouselMapper;

    @PostMapping(value = "/uploadPic")
    public HttpResult getPic(MultipartFile file) throws IOException {
        System.out.println(file);
        System.out.println("开始文件上传");
        String realName = file.getOriginalFilename();
        System.out.println("文件名："+realName);
        File file1 = new File(filePath);
        if (!file1.exists()){
            file1.mkdirs();
        }
        fileName = filePath+ realName;
        src = baseUrl+realName;
        file.transferTo(new File(fileName));
        
        return HttpResult.ok();
    }

    @PostMapping(value = "/updataPic")
    public HttpResult updataPic(@RequestBody LoopImg loopImg){
        loopImg.setUrl(src);
        sysCarouselMapper.updataPic(loopImg);
        return HttpResult.ok();
    }


    @PostMapping(value = "/newPic")
    public HttpResult addNewPic(@RequestBody LoopImg loopImg){
        loopImg.setUrl(src);
        sysCarouselMapper.insertPic(loopImg);
        return HttpResult.ok(loopImg);
    }


    @PostMapping(value = "/delPic")
    public HttpResult deletePic(@RequestBody LoopImg loopImg){
        System.out.println(loopImg.getId());
        sysCarouselMapper.delPic(loopImg.getId());
        return HttpResult.ok();
    }

    @GetMapping(value = "/getCarousel")
    public HttpResult getCarousel(){
        System.out.println("获取轮播图");
        List<LoopImg> myImg = sysCarouselMapper.getCarousel();
        return HttpResult.ok(myImg);
    }
}
