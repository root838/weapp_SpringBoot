package cn.edu.guet.weapp_SpringBoot.mapper;

import cn.edu.guet.weapp_SpringBoot.bean.Hospital;
import cn.edu.guet.weapp_SpringBoot.bean.User_Hospital;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author Pangjiaen
 * @Date 2022/8/11 11:29:51
 */
@Mapper
public interface HospitalMapper {
    List<Hospital> getHospitalList();
    List<User_Hospital> getUserHospitalList();
}
