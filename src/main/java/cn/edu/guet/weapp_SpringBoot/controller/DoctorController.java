package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.bean.Doctor;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping(value = "/getDoctorMsg")
    public HttpResult getDoctorMsg(){
        List<Doctor> result = doctorService.getDoctorMsg();
        System.out.println(result);
        return HttpResult.ok(result);
    }

    @PostMapping(value = "/insertMsg")
    public HttpResult insertMsg(@RequestBody Doctor doctor){
        try{
            System.out.println(doctor.getDoctorId());
            doctorService.insertMsg(doctor);
            return HttpResult.ok("插入成功");
        }
        catch(Exception e){
            return HttpResult.error("插入失败");
        }
    }
}
