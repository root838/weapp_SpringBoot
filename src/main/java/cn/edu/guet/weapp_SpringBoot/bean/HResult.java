package cn.edu.guet.weapp_SpringBoot.bean;
import java.sql.Date;

public class HResult {
    private Long id;
    private String openid;
    private String constitution;
    private String performance;
    private String opinion;
    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getConstitution() {
        return constitution;
    }

    public void setConstitution(String constitution) {
        this.constitution = constitution;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
