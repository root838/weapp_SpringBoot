package cn.edu.guet.weapp_SpringBoot.mapper;


import cn.edu.guet.weapp_SpringBoot.bean.SysUserWX;
import cn.edu.guet.weapp_SpringBoot.bean.Syspatient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SyspatientMapper {

    void savePatient(Syspatient syspatient);

    void delPatient(String Idcardnumber);

    List<Syspatient> getAllList();


}
