package com.zy.Model;

import java.util.Date;

public class CustomerCare {
    private Integer customerCareId;

    private Integer customerId;

    private String careSubject;

    private String careType;

    private Integer status;

    private String remark;

    private Date nextTime;

    private Date createTime;

    private Integer creater;

    private Date updateTime;

    private Integer updater;

    public Integer getCustomerCareId() {
        return customerCareId;
    }

    public void setCustomerCareId(Integer customerCareId) {
        this.customerCareId = customerCareId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCareSubject() {
        return careSubject;
    }

    public void setCareSubject(String careSubject) {
        this.careSubject = careSubject == null ? null : careSubject.trim();
    }

    public String getCareType() {
        return careType;
    }

    public void setCareType(String careType) {
        this.careType = careType == null ? null : careType.trim();
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