package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.Doctor;
import cn.edu.guet.weapp_SpringBoot.bean.Doctor;
import cn.edu.guet.weapp_SpringBoot.mapper.DoctorMapper;
import cn.edu.guet.weapp_SpringBoot.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public void insertMsg(Doctor doctor) {
        doctorMapper.insertMsg(doctor);
    }

    @Override
    public List<Doctor> getDoctorMsg() {
       List<Doctor> result= doctorMapper.getDoctorMsg();
       return result;
    }


}
