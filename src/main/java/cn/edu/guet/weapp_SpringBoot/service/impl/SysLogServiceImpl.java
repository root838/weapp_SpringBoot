package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.SysLog;
import cn.edu.guet.weapp_SpringBoot.service.SysLogService;
import org.springframework.stereotype.Service;

/**
 * @Author19793
 * @Date2022/8/14 16:30
 * @Version 1.0
 */
@Service
public class SysLogServiceImpl implements SysLogService {
    @Override
    public void save(SysLog sysLog) {
        System.out.println("sysLog = "+sysLog.toString());
    }
}
