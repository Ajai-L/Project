package com.eduhub.eduhub_backend.Component;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private String name;
    private String code;
    private int credit;
    public Course() {
    }
    public Course(String name, String code, int credit) {
        this.name = name;
        this.code = code;
        this.credit = credit;
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
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
}
