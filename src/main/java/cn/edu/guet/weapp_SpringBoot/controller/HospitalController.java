package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping(value = "/search")
    public HttpResult searchHospital(@RequestParam String name){
        return HttpResult.ok(hospitalService.searchHospital(name));
    }

    @GetMapping(value = "/getUserHospitalList")
    public HttpResult getUserHospitalList(){
        return HttpResult.ok(hospitalService.getUserHospitalList());
    }

    @GetMapping(value = "/ai")
    public HttpResult getRecommendedHospital(@RequestParam String disease){
        return HttpResult.ok(hospitalService.getRecommendedHospital(disease));
    }
}
