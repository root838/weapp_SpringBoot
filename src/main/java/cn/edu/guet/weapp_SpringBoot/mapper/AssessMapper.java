package cn.edu.guet.weapp_SpringBoot.mapper;

import cn.edu.guet.weapp_SpringBoot.bean.Question;
import cn.edu.guet.weapp_SpringBoot.bean.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssessMapper {
    //返回问题列表
    List<Question> findAllQuestion();
    //完成评估后加入结果
    void addResult(@Param(value = "Result") Result result);
}
