package com.zy.Model;

import java.util.Date;

public class CustomerLinkRecord {
    private Integer recordId;

    private Integer customerId;

    private String linkType;

    private String linkSubject;

    private String linkNexttime;

    private Integer status;

    private String remark;

    private Date nextTime;

    private Date createTime;

    private Integer creater;

    private Date updateTime;

    private Integer updater;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType == null ? null : linkType.trim();
    }

    public String getLinkSubject() {
        return linkSubject;
    }

    public void setLinkSubject(String linkSubject) {
        this.linkSubject = linkSubject == null ? null : linkSubject.trim();
    }

    public String getLinkNexttime() {
        return linkNexttime;
    }

    public void setLinkNexttime(String linkNexttime) {
        this.linkNexttime = linkNexttime == null ? null : linkNexttime.trim();
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