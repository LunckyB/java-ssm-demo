package com.swl.demossm.test;

public class TestObject {
    private String id;
    private Integer size;
    private String title;

    public TestObject(String id, Integer size, String title) {
        this.id = id;
        this.size = size;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
