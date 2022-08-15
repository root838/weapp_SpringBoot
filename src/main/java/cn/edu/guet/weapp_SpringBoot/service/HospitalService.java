package cn.edu.guet.weapp_SpringBoot.service;

import cn.edu.guet.weapp_SpringBoot.bean.*;

import java.util.List;
import java.util.Map;


public interface HospitalService {
    List<Hospital> getHospitalList();
    List<Hospital> searchHospital(String name);
    List<User_Hospital> getUserHospitalList();
    //删除医院
    void deleteHospital(String id);
    //添加医院
    void updateHospital(Hospital_Update updateHospital);

    //插入
    void insertHospital(Hospital hospital);
    List<Hospital> getRecommendedHospital(String disease);
}
