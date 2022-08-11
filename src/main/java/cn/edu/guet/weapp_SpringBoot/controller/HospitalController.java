package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author Pangjiaen
 * @Date 2022/8/11 12:00:30
 */
@RestController
@RequestMapping("hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @GetMapping(value = "/getHospitalList")
    public HttpResult getHospitalList(){
        return HttpResult.ok(hospitalService.getHospitalList());
    }
}
