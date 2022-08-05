package cn.edu.guet.weapp_SpringBoot.service;

import cn.edu.guet.weapp_SpringBoot.bean.Doctor;

import java.util.List;

public interface DoctorService {
    void insertMsg(Doctor doctor);

    List<Doctor> getDoctorMsg();
}
