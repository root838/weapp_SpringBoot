package cn.edu.guet.weapp_SpringBoot.service.impl;

import cn.edu.guet.weapp_SpringBoot.bean.LoopImg;
import cn.edu.guet.weapp_SpringBoot.mapper.SysCarouselMapper;
import cn.edu.guet.weapp_SpringBoot.service.SysCarouselService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SysCarouselServiceImpl implements SysCarouselService {

    @Autowired
    private SysCarouselMapper sysCarouselMapper;


    @Override
    public List<LoopImg> getCarousel() {
        return null;
    }

    @Override
    public void delPic(String id) {

    }

    @Override
    public void insertPic(LoopImg loopImg) {

    }

    @Override
    public void updataPic(LoopImg loopImg) {

    }
}
