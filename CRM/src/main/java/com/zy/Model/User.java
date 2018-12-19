package com.zy.Model;

import java.util.Date;
import java.util.List;

import lombok.Data;
@Data
public class User {
	private List<String> usernamelist;
	
    private Integer userId;

    private Integer departmentId;

    private Integer roleId;

    private String username;

    private Boolean isMale;

    private String mobile;

    private Integer age;

    private String address;

    private Boolean isAdmin;

    private Boolean isSystem;

    private String password;

    private String tel;

    private String idNum;

    private String email;

    private String hobby;

    private Integer education;

    private String cardNum;

    private String nation;

    private Integer marry;

    private Integer status;

    private String remark;

    private Date createTime;

    private Integer creater;

    private Date updateTime;

    private Integer updater;

  
}