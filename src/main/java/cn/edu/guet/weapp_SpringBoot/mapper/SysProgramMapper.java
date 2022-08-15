package cn.edu.guet.weapp_SpringBoot.mapper;

import cn.edu.guet.weapp_SpringBoot.bean.Program;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysProgramMapper {

    List<Program> GetPro();

    void delPro(@Param(value = "id") String id);

    void  insert(Program program);

}
