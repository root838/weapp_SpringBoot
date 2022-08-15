package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.*;
import cn.edu.guet.weapp_SpringBoot.mapper.HospitalMapper;
import cn.edu.guet.weapp_SpringBoot.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public  class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalMapper hospitalMapper;

    @Override
    public List<Hospital> getHospitalList() {
        return hospitalMapper.getHospitalList();
    }

    @Override
    public List<Hospital> searchHospital(String name) {
        name="%"+name+"%";
        return hospitalMapper.searchHospital(name);
    }

    @Override
    public List<User_Hospital> getUserHospitalList() {
        return hospitalMapper.getUserHospitalList();
    }

    @Override
    public void deleteHospital(String id) { hospitalMapper.deleteHospital(id);}

    @Override
    public void updateHospital(Hospital_Update updateHospital) {

    }

    @Override
    public void insertHospital(Hospital hospital) {hospitalMapper.insertMsg(hospital);}

}



