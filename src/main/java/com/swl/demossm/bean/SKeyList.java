package com.swl.demossm.bean;

public class SKeyList {
    private String prikey; // 私钥
    private String pubkey; // 公钥
    private String expiretime; // 生成时间
    private String type; // 类型

    public SKeyList() {
    }

    public SKeyList(String prikey, String pubkey, String expiretime, String type) {
        this.prikey = prikey;
        this.pubkey = pubkey;
        this.expiretime = expiretime;
        this.type = type;
    }

    public String getPrikey() {
        return prikey;
    }

    public void setPrikey(String prikey) {
        this.prikey = prikey;
    }

    public String getPubkey() {
        return pubkey;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    public String getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(String expiretime) {
        this.expiretime = expiretime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
