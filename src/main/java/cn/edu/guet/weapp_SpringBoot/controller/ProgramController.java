package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("program")
public class ProgramController {
    @Autowired
    private ProgramService ProgramService;
    @GetMapping(value="/getProgramList")
    public HttpResult getProgramList(){

        return HttpResult.ok(ProgramService.getProgramList());
    }
}
