package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.Hospital;
import cn.edu.guet.weapp_SpringBoot.bean.User_Hospital;
import cn.edu.guet.weapp_SpringBoot.mapper.HospitalMapper;
import cn.edu.guet.weapp_SpringBoot.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Pangjiaen
 * @Date 2022/8/11 11:58:53
 */
@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalMapper hospitalMapper;

    @Override
    public List<Hospital> getHospitalList() {
        return hospitalMapper.getHospitalList();
    }

    @Override
    public List<User_Hospital> getUserHospitalList() {
        return hospitalMapper.getUserHospitalList();
    }
}
