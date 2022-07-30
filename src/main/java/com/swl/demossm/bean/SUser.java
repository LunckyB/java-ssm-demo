package com.swl.demossm.bean;

import com.swl.demossm.tools.Kits;
import com.swl.demossm.tools.TimeUtils;

public class SUser {


    private String id; // 主键
    private String account; // 账号
    private String password; // 密码
    private String nickname; // 昵称
    private String logo; // 头像
    private String departid; // 所属部门id
    private String ip; // 最后登陆ip
    private String addtime; // 注册时间
    private Integer gender; // 性别 1: 男  2: 女  0: 未知
    private Integer isdel; // 假删除 0: 正常  1: 逻辑删除

    public SUser() {
    }

    public SUser(String id, String account, String password, String nickname, String logo, String departid, String ip, String addtime, Integer gender, Integer isdel) {
        this.setId(id);
        this.setAccount(account);
        this.setPassword(password);
        this.setNickname(nickname);
        this.setLogo(logo);
        this.setDepartid(departid);
        this.setIp(ip);
        this.setAddtime(addtime);
        this.setGender(gender);
        this.setIsdel(isdel);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null) {
            Kits kits = new Kits();
            id = kits.getGuid();
        }
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        if (account == null) {
            account = "";
        }
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null) {
            password = "";
        }
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname == null) {
            nickname = "一条小白龙";
        }
        this.nickname = nickname;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        if (logo == null) {
            logo = "";
        }
        this.logo = logo;
    }

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        if (ip == null) {
            ip = "";
        }
        this.ip = ip;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        TimeUtils timeUtils = new TimeUtils();
        this.addtime = timeUtils.getTime();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        if (gender == null) {
            gender = 1;
        }
        this.gender = gender;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        if (isdel == null) {
            isdel = 0;
        }
        this.isdel = isdel;
    }
}
