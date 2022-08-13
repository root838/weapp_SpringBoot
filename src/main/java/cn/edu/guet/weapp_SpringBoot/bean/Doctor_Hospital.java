package cn.edu.guet.weapp_SpringBoot.bean;

import java.util.Objects;

public class Doctor_Hospital {

    private String hospital_name;

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor_Hospital that = (Doctor_Hospital) o;
        return Objects.equals(hospital_name, that.hospital_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hospital_name);
    }

    @Override
    public String toString() {
        return "Doctor_Hospital{" +
                "hospital_name='" + hospital_name + '\'' +
                '}';
    }
}
