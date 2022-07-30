package com.swl.demossm.bean;

public class SConfig {
//    id	varchar	32	0	0	0	-1	0							utf8	utf8_general_ci	0	0	0	0	0	0	0
//    name	varchar	50	0	-1	0	0	0				名称			utf8	utf8_general_ci	0	0	0	0	0	0	0
//    code	varchar	100	0	-1	0	0	0				标识			utf8	utf8_general_ci	0	0	0	0	0	0	0
//    value	text	0	0	-1	0	0	0				json对象值			utf8	utf8_general_ci	0	0	0	0	0	0	0
//    addtime	timestamp	0	0	-1	0	0	0				添加时间					0	0	0	0	0	0	0
//    adduser	varchar	32	0	-1	0	0	0				添加人 关联s_user表id			utf8	utf8_general_ci	0	0	0	0	0	0	0
//    updatetime	timestamp	0	0	-1	0	0	0				修改时间					0	0	0	0	0	0	0
//    updateuser	varchar	32	0	-1	0	0	0				修改人			utf8	utf8_general_ci	0	0	0	0	0	0	0
//    isdel	int	255	0	-1	0	0	0				0: 正常 1: 逻辑删除					0	0	0	0	0	0	0
    private String id; // 主键
    private String name; // 名称
    private String code; // 标识
    private String value; // json对象值
    private String addtime; // 添加时间
    private String adduser; // 添加人 关联s_user表id
    private String updatetime; // 修改时间
    private String updateuser; // 修改人 关联s_user表id
    private Integer isdel; // 0: 正常 1: 逻辑删除

    public SConfig() {
    }

    public SConfig(String id, String name, String code, String value, String addtime, String adduser, String updatetime, String updateuser, Integer isdel) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.value = value;
        this.addtime = addtime;
        this.adduser = adduser;
        this.updatetime = updatetime;
        this.updateuser = updateuser;
        this.isdel = isdel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public String getAdduser() {
        return adduser;
    }

    public void setAdduser(String adduser) {
        this.adduser = adduser;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}
