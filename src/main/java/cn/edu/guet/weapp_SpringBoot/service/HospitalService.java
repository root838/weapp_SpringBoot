package cn.edu.guet.weapp_SpringBoot.service;

import cn.edu.guet.weapp_SpringBoot.bean.Hospital;
import cn.edu.guet.weapp_SpringBoot.bean.User_Hospital;

import java.util.List;

/**
 * @Author Pangjiaen
 * @Date 2022/8/11 11:58:30
 */
public interface HospitalService {
    List<Hospital> getHospitalList();
    List<User_Hospital> getUserHospitalList();
}
