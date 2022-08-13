package cn.edu.guet.weapp_SpringBoot.bean;

import java.util.Objects;

public class Doctor {
    private String doctorId;

    private String hospitalId;

    private String avatar;

    private String doctorName;

    private String position;

    private String skill;

    private int seeing;

    private Doctor_Hospital doctor_hospital;

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

    public Doctor_Hospital getDoctor_hospital() {
        return doctor_hospital;
    }

    public void setDoctor_hospital(Doctor_Hospital doctor_hospital) {
        this.doctor_hospital = doctor_hospital;
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

    public int getSeeing() {
        return seeing;
    }

    public void setSeeing(int seeing) {
        this.seeing = seeing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return seeing == doctor.seeing && Objects.equals(doctorId, doctor.doctorId) && Objects.equals(hospitalId, doctor.hospitalId) && Objects.equals(avatar, doctor.avatar) && Objects.equals(doctorName, doctor.doctorName) && Objects.equals(position, doctor.position) && Objects.equals(skill, doctor.skill) && Objects.equals(doctor_hospital, doctor.doctor_hospital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorId, hospitalId, avatar, doctorName, position, skill, seeing, doctor_hospital);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctorId + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                ", avatar='" + avatar + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", position='" + position + '\'' +
                ", skill='" + skill + '\'' +
                ", seeing=" + seeing +
                ", doctor_hospital=" + doctor_hospital +
                '}';
    }
}
