package cn.edu.guet.weapp_SpringBoot.bean;

import java.util.Objects;

public class Doctor_Update {
    private String doctorId;

    private String hospitalId;

    private String avatar;

    private String doctorName;

    private String position;

    private String skill;

    private String selectId;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSelectId() {
        return selectId;
    }

    public void setSelectId(String selectId) {
        this.selectId = selectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor_Update that = (Doctor_Update) o;
        return Objects.equals(doctorId, that.doctorId) && Objects.equals(hospitalId, that.hospitalId) && Objects.equals(avatar, that.avatar) && Objects.equals(doctorName, that.doctorName) && Objects.equals(position, that.position) && Objects.equals(skill, that.skill) && Objects.equals(selectId, that.selectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorId, hospitalId, avatar, doctorName, position, skill, selectId);
    }

    @Override
    public String toString() {
        return "Doctor_Update{" +
                "doctorId='" + doctorId + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                ", avatar='" + avatar + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", position='" + position + '\'' +
                ", skill='" + skill + '\'' +
                ", selectId='" + selectId + '\'' +
                '}';
    }
}
