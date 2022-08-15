package cn.edu.guet.weapp_SpringBoot.mapper;

import cn.edu.guet.weapp_SpringBoot.bean.HResult;
import cn.edu.guet.weapp_SpringBoot.bean.SysUserWX;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Liwei
 * @Date 2021-08-13 17:50
 */
@Mapper
public interface SysUserWXMapper {
    List<SysUserWX> findAll(String id);

    int create(SysUserWX sysUserwx);

    int savaAll(SysUserWX sysUserwx);

    List<HResult> findResult(String openid);


}