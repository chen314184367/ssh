package com.zy.Model;

import java.util.Date;

public class CustomerState {
    private Integer customerStateId;

    private String customerStateName;

    private String customerStateDesc;

    private Integer status;

    private String remark;

    private Date createTime;

    private Integer creater;

    private Date updateTime;

    private Integer updater;

    public Integer getCustomerStateId() {
        return customerStateId;
    }

    public void setCustomerStateId(Integer customerStateId) {
        this.customerStateId = customerStateId;
    }

    public String getCustomerStateName() {
        return customerStateName;
    }

    public void setCustomerStateName(String customerStateName) {
        this.customerStateName = customerStateName == null ? null : customerStateName.trim();
    }

    public String getCustomerStateDesc() {
        return customerStateDesc;
    }

    public void setCustomerStateDesc(String customerStateDesc) {
        this.customerStateDesc = customerStateDesc == null ? null : customerStateDesc.trim();
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