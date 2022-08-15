package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.HResult;
import cn.edu.guet.weapp_SpringBoot.bean.SysUserWX;
import cn.edu.guet.weapp_SpringBoot.mapper.SysUserWXMapper;
import cn.edu.guet.weapp_SpringBoot.service.SysUserWXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Liwei
 * @Date 2021-08-13 18:12
 */
@Service
public class SysUserWXServiceImpl implements SysUserWXService {

    @Autowired
    private SysUserWXMapper sysUserwxMapper;

    @Override
    public List<SysUserWX> findAll(String id) {
        return sysUserwxMapper.findAll(id);
    }

    @Override
    public int create(SysUserWX sysUserwx) {
        return sysUserwxMapper.create(sysUserwx);
    }

    @Override
    public int savaAll(SysUserWX sysUserwx) {
        return sysUserwxMapper.savaAll(sysUserwx);
    }

    @Override
    public List<HResult> findResult(String openid) {
        return sysUserwxMapper.findResult(openid);
    }

}
