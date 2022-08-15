package cn.edu.guet.weapp_SpringBoot.controller;


import cn.edu.guet.weapp_SpringBoot.bean.LoopImg;
import cn.edu.guet.weapp_SpringBoot.bean.Syspatient;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.mapper.SyspatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SyspatientController {
    @Autowired
    private SyspatientMapper syspatientMapper;

    @GetMapping(value ="/savePatient")
    public HttpResult savePatient(String idcardtype, String idcardnumber, String name, String gender,String birthday,String de_address, String married, String phone_number, String relationship){
        Syspatient syspatient = new Syspatient();
        syspatient.setIdcardtype(idcardtype);
        syspatient.setIdcardnumber(idcardnumber);
        syspatient.setName(name);
        syspatient.setGender(gender);syspatient.setDe_addreess(de_address);
        syspatient.setMarried(married);
        syspatient.setBirthday(birthday);
        syspatient.setPhone_number(phone_number);
        syspatient.setRelationship(relationship);
        syspatientMapper.savePatient(syspatient);
        return HttpResult.ok();
    }
    @GetMapping(value ="/getAllList")
    public HttpResult getAllList(){
        List<Syspatient> getList=syspatientMapper.getAllList();
        return HttpResult.ok(getList);
    }

    @PostMapping(value = "/delPatient")
    public HttpResult delPatient(@RequestBody Syspatient syspatient){
        System.out.println(syspatient.getIdcardnumber());
        syspatientMapper.delPatient(syspatient.getIdcardnumber());
        return HttpResult.ok();
    }

}
