package cn.edu.guet.weapp_SpringBoot.service;

import cn.edu.guet.weapp_SpringBoot.bean.Doctor;
import cn.edu.guet.weapp_SpringBoot.bean.Doctor_Update;


import java.util.List;

public interface DoctorService {
    void insertMsg(Doctor doctor);

    List<Doctor> getDoctorMsg();

    void deleteDoctor(String selectId);

    void updateDoctor(Doctor_Update updateDoctor);
}
