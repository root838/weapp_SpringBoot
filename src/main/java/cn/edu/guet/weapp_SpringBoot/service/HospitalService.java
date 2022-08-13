package cn.edu.guet.weapp_SpringBoot.service;

import cn.edu.guet.weapp_SpringBoot.bean.*;

import java.util.List;
import java.util.Map;


public interface HospitalService {
    //列表
    List<Hospital> getHospitalList();
    //列表
    List<User_Hospital> getUserHospitalList();
    //删除医院
    void deleteHospital(String id);
    //添加医院
    void updateHospital(Hospital_Update updateHospital);

    //插入
    void insertHospital(Hospital hospital);




}
