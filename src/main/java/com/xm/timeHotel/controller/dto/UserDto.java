package com.xm.timeHotel.controller.dto;

import java.util.Date;

import lombok.Data;

@Data
public class UserDto {
	
	private Integer id;
    /**
     * 验证码
     */
    private Integer code;
    /**
     * 昵称
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 账号
     */
    private String email;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 生日
     */
    private Date birth;
    /**
     * 头像地址
     */
    private String icon;
    /**
     * 个性签名
     */
    private String signature;

}
