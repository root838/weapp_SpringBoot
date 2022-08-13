package cn.edu.guet.weapp_SpringBoot.bean;

import java.util.Objects;

/**
 * @Author Pangjiaen
 * @Date 2022/8/11 14:18:10
 */
public class User_Hospital {
    private String userId;
    private String hospitalId;
    private Byte isLike;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Byte getIsLike() {
        return isLike;
    }

    public void setIsLike(Byte isLike) {
        this.isLike = isLike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User_Hospital)) return false;
        User_Hospital that = (User_Hospital) o;
        return Objects.equals(userId, that.userId) && Objects.equals(hospitalId, that.hospitalId) && Objects.equals(isLike, that.isLike);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, hospitalId, isLike);
    }

    @Override
    public String toString() {
        return "User_Hospital{" +
                "userId='" + userId + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                ", isLike=" + isLike +
                '}';
    }
}
