package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.HResult;
import cn.edu.guet.weapp_SpringBoot.bean.Program;
import cn.edu.guet.weapp_SpringBoot.bean.SysUserWX;
import cn.edu.guet.weapp_SpringBoot.mapper.ProgramMapper;
import cn.edu.guet.weapp_SpringBoot.mapper.SysUserWXMapper;
import cn.edu.guet.weapp_SpringBoot.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgramServiceImpl implements ProgramService {
    @Autowired
    private ProgramMapper ProgramMapper;

    @Override
    public List<Program> getProgramList() {
        return ProgramMapper.getProgramList();
    }

}
