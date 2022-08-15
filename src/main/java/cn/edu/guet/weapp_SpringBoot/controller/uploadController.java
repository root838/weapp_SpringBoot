package cn.edu.guet.weapp_SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class uploadController {
    /**
     *
     * @param file
     * @throws IllegalStateException
     */
    //定义上传文件的存放位置
    private String filePath="/root/image/";
    @PostMapping(value = "/upload")
    public void imageUpload(MultipartFile file) throws IllegalStateException{
        System.out.println(file);
        File filee=new File(filePath);
        if(!filee.exists()){
            filee.mkdirs();
        }
        //文件名称
        String realFileName = file.getOriginalFilename();
        String newFilePath=filePath+realFileName;
        //新文件的路径
        try {
            file.transferTo(new File(newFilePath));
            //将传来的文件写入新建的文件
            System.out.println("上传图片成功进行上传文件测试");

        }catch (IllegalStateException e ) {
            e.printStackTrace();
            //处理异常
        }catch(IOException e1){
            e1.printStackTrace();
            //处理异常
        }

    }


}
