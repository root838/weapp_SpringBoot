package cn.edu.guet.weapp_SpringBoot.controller;

import cn.edu.guet.weapp_SpringBoot.bean.LoginBean;
import cn.edu.guet.weapp_SpringBoot.bean.SysUser;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.mapper.SysCarouselMapper;
import cn.edu.guet.weapp_SpringBoot.mapper.SysUserMapper;
import cn.edu.guet.weapp_SpringBoot.util.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class signUpController {


    @Autowired
    private SysUserMapper sysUserMapper;

    @PostMapping(value = "/signUp")
    public HttpResult signUp(@RequestBody LoginBean loginBean){
        System.out.println("开始注册");
        byte b = 1;
        SysUser user = new SysUser();
        user.setName(loginBean.getUsername());
        user.setSalt(PasswordUtils.getSalt());
        user.setPassword(PasswordUtils.encode(loginBean.getPassword(),user.getSalt()));
        user.setStatus(b);
//        sysUserMapper.addUser(user);
        return HttpResult.ok();
    }
}
