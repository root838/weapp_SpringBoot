package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.Question;
import cn.edu.guet.weapp_SpringBoot.bean.Result;
import cn.edu.guet.weapp_SpringBoot.mapper.AssessMapper;
import cn.edu.guet.weapp_SpringBoot.service.AssessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssessServiceImpl implements AssessService {

    @Autowired
    AssessMapper assessMapper;

    @Override
    public List<Question> findAllQuestion() {
        return assessMapper.findAllQuestion();
    }

    @Override
    public void addResult(Result result) {
        assessMapper.addResult(result);
    }

    @Override
    public int getAssessNum() {
        return assessMapper.getAssessNum();
    }
}
