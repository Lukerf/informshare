package com.yxg.informshare.entity;

/**
 * @Description TODO
 * @Author xiguang_yin
 * @Date 2020/4/11 17:02
 */
public class DynamicInfo {

    private int pid;
    private int userId;
    private String title;
    private String context;
    private String image;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
