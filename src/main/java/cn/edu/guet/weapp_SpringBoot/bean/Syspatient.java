package cn.edu.guet.weapp_SpringBoot.bean;

import java.util.Date;

public class Syspatient {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String idcardtype;
    private String idcardnumber;
    private String name;
    private String gender;
    private String birthday;
    private String de_addreess;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    private String married;
    private String phone_number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }




    public String getDe_addreess() {
        return de_addreess;
    }

    public void setDe_addreess(String de_addreess) {
        this.de_addreess = de_addreess;
    }



    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    private String relationship;

    public String getIdcardnumber() {
        return idcardnumber;
    }

    public void setIdcardnumber(String idcardnumber) {
        this.idcardnumber = idcardnumber;
    }

    public String getIdcardtype() {
        return idcardtype;
    }

    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype;
    }
}
