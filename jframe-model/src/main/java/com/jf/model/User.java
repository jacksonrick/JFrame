package com.jf.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jf.entity.BaseVo;
import com.jf.valid.EmptyPattern;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * @date 2016年12月21日 上午 11:20:07
 * @author jfxu
 */
public class User extends BaseVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 昵称 */
    @NotEmpty(message = "昵称不能为空")
    @Pattern(regexp = "^[A-Za-z0-9]+$", message = "昵称格式错误，只能是英文和数字")
    @Length(min = 2, max = 16, message = "昵称在2-16个字符")
    private String nickname;

    /** 手机号 */
    @EmptyPattern(regexp = "^1[3|4|5|7|8][0-9]\\d{8}$", message = "手机号格式错误")
    private String phone;

    /** 邮箱 */
    @EmptyPattern(regexp = "\\w+((-w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+", message = "邮箱格式错误")
    private String email;

    /** 密码 */
    @EmptyPattern(regexp = "^[A-Za-z0-9]+$", message = "密码格式错误，只能是英文和数字")
    @JsonIgnore
    private String password;

    /** 头像 */
    private String avatar;

    /** 注册时间 */
    private Date createTime;

    /** 最近登陆时间 */
    private Date lastLoginTime;

    /** 真实姓名 */
    private String realname;

    /** 身份证号码 */
    @EmptyPattern(regexp = "^(\\d{15}$|^\\d{18}$|^\\d{17}(\\d|X|x))$",message = "身份证格式不正确")
    private String idcard;

    /** 性别 1-男 0-女 */
    private Boolean gender;

    /** 住址 */
    private String address;

    /** 出生日期 */
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    private String birthday;

    /** 是否删除 1-是 0-否(默认) */
    private Boolean isDelete;

    // 搜索条件

    public User() {
    }

    public User(Long id) {
        super();
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Boolean getIsDelete() {
        return this.isDelete;
    }

}



