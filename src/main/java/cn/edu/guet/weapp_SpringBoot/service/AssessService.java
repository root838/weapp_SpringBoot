package cn.edu.guet.weapp_SpringBoot.service;

import cn.edu.guet.weapp_SpringBoot.bean.Question;
import cn.edu.guet.weapp_SpringBoot.bean.Result;

import java.util.List;

public interface AssessService {
    //返回问题列表
    List<Question> findAllQuestion();
    //完成评估后加入结果
    void addResult(Result result);
    //获取进行过评估的人数
    int getAssessNum();
}
