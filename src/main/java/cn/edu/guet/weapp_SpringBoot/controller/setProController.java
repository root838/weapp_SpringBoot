package cn.edu.guet.weapp_SpringBoot.controller;



import cn.edu.guet.weapp_SpringBoot.bean.Program;
import cn.edu.guet.weapp_SpringBoot.http.HttpResult;
import cn.edu.guet.weapp_SpringBoot.mapper.SysProgramMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class setProController {
    @Autowired
    private SysProgramMapper sysProgramMapper;

    @PostMapping(value = "/newPro")
    public HttpResult addNewPic(@RequestBody Program program){
        List<Program> allList = sysProgramMapper.GetPro();
        Integer a = allList.size()+1;
        program.setId(a.toString());
        program.setViews(0);
        sysProgramMapper.insert(program);
        return HttpResult.ok();
    }
}
