package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.bean.Program;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.mapper.SysProgramMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramControllerZJP {
    @Autowired
    private SysProgramMapper sysProgramMapper;


    @GetMapping(value = "/GetAllPro")
    public HttpResult Prolist() {
        List<Program> ProList = sysProgramMapper.GetPro();
        System.out.println(ProList);
        return HttpResult.ok(ProList);
    }

    @PostMapping(value = "/deletePro")
    public HttpResult Dellist(@RequestBody Program program) {
        System.out.println(program.getId());
        sysProgramMapper.delPro(program.getId());
        List<Program> ProList = sysProgramMapper.GetPro();
        return HttpResult.ok(ProList);

    }


    @GetMapping(value = "/getProgramList")
    public HttpResult getProgramList() {
        return HttpResult.ok(sysProgramMapper.GetPro());
    }
}