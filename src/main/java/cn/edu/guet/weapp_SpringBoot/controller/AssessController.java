package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.bean.Result;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.service.AssessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("assess")
public class AssessController {
    @Autowired
    AssessService assessService;

    @GetMapping(value = "/findAll")
    public HttpResult findAllQuestion(){
        return HttpResult.ok(assessService.findAllQuestion());
    }

    @GetMapping(value = "addResult")
    public HttpResult addResult(String openid){
        Result result=new Result();
        result.setOpenid(openid);
        assessService.addResult(result);
        return HttpResult.ok("插入成功");
    }
}
