package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.bean.SysUserWX;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.service.SysUserWXService;
import cn.edu.guet.weapp_SpringBoot.util.WxOpenIdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;

/**
 * 微信小程序用户模块控制器
 *
 * @author Liwei
 * @Date 2021-08-15 11:25
 */
@RestController
@RequestMapping("userwx")
public class SysUserWXController {

    @Autowired
    private SysUserWXService sysUserWXService;

    //拿到用户数据
    @GetMapping(value = "/findAll")
    public HttpResult findAll(String id) {
        System.out.println("dvfd");
        return HttpResult.ok(sysUserWXService.findAll(id));
    }


    //拿到结果信息
    @GetMapping(value = "/findresult")
    public HttpResult findResult(String openid) {
        System.out.println("~~~");
        return HttpResult.ok(sysUserWXService.findResult(openid));
    }

    //一开始创建一个初始表
    @GetMapping(value = "/create")
    public int create(String id, String avatar) {
        System.out.println("成功创建一个初始表");
        SysUserWX sysuserT=new SysUserWX();
        sysuserT.setId(id);
        sysuserT.setAvatar(avatar);
        return sysUserWXService.create(sysuserT);
    }


    //获取openid
    @GetMapping(value = "/getopenid")
    public String openid(String code) {
        WxOpenIdUtil wxOpenIdUtil =new WxOpenIdUtil();
        System.out.println("成功调用getopenid");
        return wxOpenIdUtil.getOpenId(code);
    }

    //保存用户信息，也就是更新表
    @GetMapping(value = "/savaAll")
    public int savaAll(String id,String name,Long gender,String idcard_type,Long idcard_number,Date birthday,Long phone_number) {
        System.out.println("成功更新一个表");
        SysUserWX sysuserT=new SysUserWX();
        sysuserT.setId(id);
        sysuserT.setName(name);
        sysuserT.setGender(gender);
        sysuserT.setIdcard_type(idcard_type);
        sysuserT.setIdcard_number(idcard_number);
        sysuserT.setBirthday(birthday);
        sysuserT.setPhone_number(phone_number);
        return sysUserWXService.savaAll(sysuserT);
    }
}
