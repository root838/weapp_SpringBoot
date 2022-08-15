package cn.edu.guet.weapp_SpringBoot.mapper;

import cn.edu.guet.weapp_SpringBoot.bean.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface HospitalMapper {


    List<Hospital> getHospitalList();
    List<Hospital> searchHospital(@Param(value = "name") String name);
    List<User_Hospital> getUserHospitalList();
    void deleteHospital(@Param(value = "id") String id);
    void insertMsg(@Param(value = "hospital") Hospital hospital);
    void updateHospital(@Param(value = "updateForm") Hospital_Update updateForm);
    //int updataHospital( aricle);
    // List<Hospital_Update> newHospitalList();
}
