package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.bean.Hospital;
import cn.edu.guet.weapp_SpringBoot.bean.Hospital_Update;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.File;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("hospital")
public class HospitalController {

    private String filePath  = "C:/Users/MECHREVO/Desktop/img/";//实际存储的地址
    private String fileName = "";

    private String baseUrl="C:/Users/MECHREVO/Desktop/img/";//src地址
    private String src = "";
    Hospital Hospital=new Hospital();

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

    @PostMapping(value = "/insertHospitalMsg")
    public HttpResult insertHospitalMsg(@RequestBody Hospital hospital){
        try{
            //Hospital_Update.setImage();
            //System.out.println(Hospital_Update.setImage("wr"));
            System.out.println(hospital);
            hospitalService.insertHospital(hospital);
            return HttpResult.ok("插入成功");
        }
        catch(Exception e){
            return HttpResult.error("插入失败"+e);
        }
    }

    @PostMapping(value = "/uploadHospitalMsg")
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


    @GetMapping (value = "/deleteHospital")
    public HttpResult deleteHospital(String id){
        System.out.println(id);
        try{
            System.out.println(id);
            hospitalService.deleteHospital(id);
            return HttpResult.ok(Hospital);
        }catch (Exception e){
            return HttpResult.error("删除失败");
        }
    }

    @PostMapping(value = "/updateHospitalMsg")
    public HttpResult updateHospitalMsg(@RequestBody Hospital_Update updateHospital){
        try{
            //updateHospital.setImage(src);
            System.out.println(updateHospital);
            hospitalService.updateHospital(updateHospital);
            return HttpResult.ok("修改成功");
        }catch(Exception e){
            return HttpResult.error("修改失败:"+e);
        }
    }
}

