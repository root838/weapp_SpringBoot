package cn.edu.guet.weapp_SpringBoot.service;

import cn.edu.guet.weapp_SpringBoot.bean.HResult;
import cn.edu.guet.weapp_SpringBoot.bean.Program;
import cn.edu.guet.weapp_SpringBoot.bean.SysUserWX;

import java.util.List;

public interface ProgramService {
    List<Program> getProgramList();
}
