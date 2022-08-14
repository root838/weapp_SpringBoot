package cn.edu.guet.weapp_SpringBoot.service;
import cn.edu.guet.weapp_SpringBoot.bean.HResult;
import cn.edu.guet.weapp_SpringBoot.bean.SysUserWX;
import java.util.List;


/**
 * 角色管理
 *
 * @Author Liwei
 * @Date 2021-08-13 18:04
 */
public interface SysUserWXService {

    /**
     * 查询全部
     *
     * @return
     */
    List<SysUserWX> findAll(String id);
    int create(SysUserWX sysUserwx);
    int savaAll(SysUserWX sysUserwx);
    List<HResult> findResult(String openid);
}
