package cn.edu.guet.weapp_SpringBoot.service;

import cn.edu.guet.weapp_SpringBoot.bean.LoopImg;

import java.util.List;

public interface SysCarouselService {
    List<LoopImg> getCarousel();

    void delPic(String id);

    void insertPic(LoopImg loopImg);

    void updataPic(LoopImg loopImg);
}
