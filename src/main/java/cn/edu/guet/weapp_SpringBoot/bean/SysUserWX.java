package cn.edu.guet.weapp_SpringBoot.bean;

import java.sql.Date;

public class SysUserWX {
    private String id;
    private String avatar;
    private String name;
    private Long gender;
    private String idcard_type;
    private Long idcard_number;
    private Date birthday;
    private Long phone_number;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public String getIdcard_type() {
        return idcard_type;
    }

    public void setIdcard_type(String idcard_type) {
        this.idcard_type = idcard_type;
    }

    public Long getIdcard_number() {
        return idcard_number;
    }

    public void setIdcard_number(Long idcard_number) {
        this.idcard_number = idcard_number;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Long phone_number) {
        this.phone_number = phone_number;
    }
}
