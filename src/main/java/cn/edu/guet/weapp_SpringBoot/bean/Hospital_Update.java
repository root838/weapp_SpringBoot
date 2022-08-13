package cn.edu.guet.weapp_SpringBoot.bean;

import java.util.Objects;

public class Hospital_Update {

        private String id;
        private String name;
        private String address;
        private String phone;
        private String synopsis;
        private int score;
        private int likeNum;
        private String image;
        private int remaing;
        private Byte isHot;



    public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getSynopsis() {
            return synopsis;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getLikeNum() {
            return likeNum;
        }

        public void setLikeNum(int likeNum) {
            this.likeNum = likeNum;
        }

        public String getImage() {
            return image;
        }

        public void  setImage(String image) {
            this.image = image;
        }

        public int getRemaing() {
            return remaing;
        }

        public void setRemaing(int remaing) {
            this.remaing = remaing;
        }

        public Byte getIsHot() {
            return isHot;
        }

        public void setIsHot(Byte isHot) {
            this.isHot = isHot;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hospital)) return false;
        Hospital hospital = (Hospital) o;
        return score == hospital.getScore() && likeNum == hospital.getLikeNum() && remaing == hospital.getRemaing() && Objects.equals(id, hospital.getId()) && Objects.equals(name, hospital.getName()) && Objects.equals(address, hospital.getAddress()) && Objects.equals(phone, hospital.getPhone()) && Objects.equals(synopsis, hospital.getSynopsis()) && Objects.equals(image, hospital.getImage()) && Objects.equals(isHot, hospital.getIsHot());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, phone, synopsis, score, likeNum, image, remaing, isHot);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", score=" + score +
                ", likeNum=" + likeNum +
                ", image='" + image + '\'' +
                ", remaing=" + remaing +
                ", isHot=" + isHot +
                '}';
    }

}
