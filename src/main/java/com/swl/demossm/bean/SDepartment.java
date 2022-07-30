package com.swl.demossm.bean;

import com.swl.demossm.tools.Kits;
import com.swl.demossm.tools.TimeUtils;

public class SDepartment {

    private String id; // 主键
    private String name; // 名称
    private String parentid; // 上级部门id
    private String admin; // 部门管理员id  关联s_user表id
    private String addtime; // 添加时间
    private String adduser; // 添加人  关联s_user表id
    private String updatetime; // 最后修改时间
    private String updateuser; // 最后修改人 关联s_user表id
    private String logo; // 部门logo
    private Integer isdel; //  假删除 0: 正常 1: 逻辑删除

    public SDepartment(String id) {
    }

    public SDepartment(String id, String name, String parentid, String admin, String addtime, String adduser, String updatetime, String updateuser, String logo, Integer isdel) {
        this.setId(id);
        this.setName(name);
        this.setParentid(parentid);
        this.setAdmin(admin);
        this.setAddtime(addtime);
        this.setAdduser(adduser);
        this.setUpdatetime(updatetime);
        this.setUpdateuser(updateuser);
        this.setLogo(logo);
        this.setIsdel(isdel);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null) {
            id = new Kits().getGuid();
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            name = "";
        }
        this.name = name;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        if (parentid == null) {
            parentid = "0";
        }
        this.parentid = parentid;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        if (admin == null) {
            admin = "";
        }
        this.admin = admin;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = new TimeUtils().getTime();
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        if (adduser == null) {
            adduser = "";
        }
        this.adduser = adduser;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = new TimeUtils().getTime();
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        if (updateuser == null) {
            updateuser = "";
        }
        this.updateuser = updateuser;
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
