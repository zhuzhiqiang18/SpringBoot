package com.zzq.demo.model;

public class LikeLink {
    private Integer id;

    private String link;

    private String remark;

    private Integer programmerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getProgrammerId() {
        return programmerId;
    }

    public void setProgrammerId(Integer programmerId) {
        this.programmerId = programmerId;
    }
}