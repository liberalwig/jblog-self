package com.javaex.vo;

public class UserVo {

    private String id;
    private String password;
    private String name;
    private int userNo;

    public UserVo() {

    }

    public UserVo(String id, String password, String name, int userNo) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.userNo = userNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", userNo=" + userNo +
                '}';
    }
}
