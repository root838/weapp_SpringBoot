package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.Hospital;
import cn.edu.guet.weapp_SpringBoot.bean.User_Hospital;
import cn.edu.guet.weapp_SpringBoot.mapper.HospitalMapper;
import cn.edu.guet.weapp_SpringBoot.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<Hospital> searchHospital(String name) {
        name="%"+name+"%";
        return hospitalMapper.searchHospital(name);
    }

    @Override
    public List<User_Hospital> getUserHospitalList() {
        return hospitalMapper.getUserHospitalList();
    }

    @Override
    public List<Hospital> getRecommendedHospital(String disease) {
        String[] x = disease.split("，");
        List<String> hospitalId=new ArrayList<>();

        for(int i=0;i<x.length;i++){
            hospitalId.add(hospitalMapper.getHospitalIdByDoctorSkill(x[i]).get(0));
        }
        int s[]=new int[hospitalId.size()];
        for(int i=0;i<hospitalId.size();i++){
            s[i]=0;
            for (int j=1;j<hospitalId.size();j++){
                if(hospitalId.get(i)==hospitalId.get(j)){
                    s[i]++;
                }
            }
        }
        int max=0;
        for (int i=0;i<s.length;i++){
            if(max<s[i]){
                max=i;
            }
        }

        return hospitalMapper.getHospitalById(hospitalId.get(max));
    }
}
