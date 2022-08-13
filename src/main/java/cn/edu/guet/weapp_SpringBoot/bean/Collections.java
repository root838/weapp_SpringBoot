package cn.edu.guet.weapp_SpringBoot.bean;

/**
 * @Author19793
 * @Date2022/8/10 20:58
 * @Version 1.0
 */
public class Collections {
    String id;
    String open_id;
    String article_id;

    @Override
    public String toString() {
        return "Collections{" +
                "id='" + id + '\'' +
                ", open_id='" + open_id + '\'' +
                ", article_id='" + article_id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public String getArticle_id() {
        return article_id;
    }

    public void setArticle_id(String article_id) {
        this.article_id = article_id;
    }
}
