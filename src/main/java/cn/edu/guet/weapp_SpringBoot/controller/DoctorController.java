package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.bean.Doctor;
import cn.edu.guet.weapp_SpringBoot.bean.Doctor_Update;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.mapper.SysCarouselMapper;
import cn.edu.guet.weapp_SpringBoot.service.DoctorService;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.print.Doc;
import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("doctor")
public class DoctorController {


    private String filePath  = "/root/image/";//实际存储的地址
    private String fileName = "";
    private String baseUrl="http://47.95.223.172:90/image/";//src地址
    private String src = "";
    Doctor doctor=new Doctor();

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
            doctor.setAvatar(src);
            System.out.println(doctor.getAvatar());
            System.out.println(doctor);
            doctorService.insertMsg(doctor);
            return HttpResult.ok("插入成功");
        }
        catch(Exception e){
            return HttpResult.error("插入失败"+e);
        }
    }

    @PostMapping(value = "/uploadAvatar")
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
        System.out.println("src:"+src);
        return HttpResult.ok(src);
    }

    @GetMapping (value = "/deleteMsg")
    public HttpResult deleteMsg(String selectId){
        System.out.println(selectId);
        try{
            System.out.println(selectId);
            doctorService.deleteDoctor(selectId);
            return HttpResult.ok(doctor);
        }catch (Exception e){
            return HttpResult.error("删除失败");
        }
    }

    @PostMapping(value = "/updateMsg")
    public HttpResult updateMsg(@RequestBody Doctor_Update updateDoctor){
        try{
            System.out.println(updateDoctor);
            doctorService.updateDoctor(updateDoctor);
            return HttpResult.ok("修改成功");
        }catch(Exception e){
            return HttpResult.error("修改失败:"+e);
        }
    }
}
