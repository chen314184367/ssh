package com.zy.Model;

import java.util.Date;

public class CustomerLink {
    private Integer linkId;

    private Integer customerId;

    private String linkName;

    private String linkIsMale;

    private String linkPosition;

    private String linkMobile;

    private Integer linkAge;

    private Integer linkRelation;

    private Integer status;

    private String remark;

    private Date nextTime;

    private Date createTime;

    private Integer creater;

    private Date updateTime;

    private Integer updater;

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    public String getLinkIsMale() {
        return linkIsMale;
    }

    public void setLinkIsMale(String linkIsMale) {
        this.linkIsMale = linkIsMale == null ? null : linkIsMale.trim();
    }

    public String getLinkPosition() {
        return linkPosition;
    }

    public void setLinkPosition(String linkPosition) {
        this.linkPosition = linkPosition == null ? null : linkPosition.trim();
    }

    public String getLinkMobile() {
        return linkMobile;
    }

    public void setLinkMobile(String linkMobile) {
        this.linkMobile = linkMobile == null ? null : linkMobile.trim();
    }

    public Integer getLinkAge() {
        return linkAge;
    }

    public void setLinkAge(Integer linkAge) {
        this.linkAge = linkAge;
    }

    public Integer getLinkRelation() {
        return linkRelation;
    }

    public void setLinkRelation(Integer linkRelation) {
        this.linkRelation = linkRelation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getNextTime() {
        return nextTime;
    }

    public void setNextTime(Date nextTime) {
        this.nextTime = nextTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreater() {
        return creater;
    }

    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdater() {
        return updater;
    }

    public void setUpdater(Integer updater) {
        this.updater = updater;
    }
}