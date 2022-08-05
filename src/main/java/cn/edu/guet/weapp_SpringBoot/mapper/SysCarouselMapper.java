package cn.edu.guet.weapp_SpringBoot.mapper;

import cn.edu.guet.weapp_SpringBoot.bean.LoopImg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysCarouselMapper {
    List<LoopImg> getCarousel();

    void delPic(String id);

    void insertPic(LoopImg loopImg);

    void updataPic(LoopImg loopImg);

}
