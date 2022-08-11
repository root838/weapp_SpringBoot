package cn.edu.guet.weapp_SpringBoot.mapper;

import cn.edu.guet.weapp_SpringBoot.bean.Doctor;
import cn.edu.guet.weapp_SpringBoot.bean.Doctor_Update;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

@Mapper
public interface DoctorMapper {
    void insertMsg(@Param(value = "doctor") Doctor doctor);

    List<Doctor> getDoctorMsg();

    void deleteDoctor(@Param(value = "ID") String selectId);

    void updateDoctor(@Param(value = "updateForm") Doctor_Update updateForm);
}
