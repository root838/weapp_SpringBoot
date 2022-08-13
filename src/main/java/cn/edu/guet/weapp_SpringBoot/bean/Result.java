package cn.edu.guet.weapp_SpringBoot.bean;

public class Result {
    private String openid;
    private String constitution="平和质偏痰湿质";
    private String performance="主要表现：面色、肤色润泽，头发较密，目光有神，不易疲劳，精力充沛，耐受寒热，睡眠良好，胃纳佳，二便正常，舌色淡红、苔薄白，脉和缓有力";
    private String opinion="人体的生命活动随着年节律、季节律、月节律、昼夜节律等自然规律而发生相应的生理变化。故《灵枢·本神》强调:“故智者之养生也，必顺四时而适寒暑，和喜怒而安居处，节阴阳而调刚柔，如是则邪僻不至，长生久视”。即使是阴阳和调之人一也要起居有常，不妄作劳，顺应四时，悉心调护，才能增进健康，延年益寿。";

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
}
