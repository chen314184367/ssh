package com.zy.Model;

import java.util.Date;

public class Message {
    private Integer messageId;

    private String subject;

    private String content;

    private Integer sender;

    private Integer sendDelete;

    private Integer sendStatus;

    private Date saveTime;

    private Date sendTime;

    private Date sendUpdateTime;

    private Integer receiver;

    private Integer receiveDelete;

    private Integer receiveStatus;

    private Date receiveUpdateTime;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public Integer getSendDelete() {
        return sendDelete;
    }

    public void setSendDelete(Integer sendDelete) {
        this.sendDelete = sendDelete;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Date getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(Date saveTime) {
        this.saveTime = saveTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getSendUpdateTime() {
        return sendUpdateTime;
    }

    public void setSendUpdateTime(Date sendUpdateTime) {
        this.sendUpdateTime = sendUpdateTime;
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    public Integer getReceiveDelete() {
        return receiveDelete;
    }

    public void setReceiveDelete(Integer receiveDelete) {
        this.receiveDelete = receiveDelete;
    }

    public Integer getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(Integer receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    public Date getReceiveUpdateTime() {
        return receiveUpdateTime;
    }

    public void setReceiveUpdateTime(Date receiveUpdateTime) {
        this.receiveUpdateTime = receiveUpdateTime;
    }
}