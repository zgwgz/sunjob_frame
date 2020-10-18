package com.domain;

import java.util.Arrays;

public class Student {
    private String name;
    private String gender;
    private Source source;

    private String[] ah;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", source=" + source +
                ", ah=" + Arrays.toString(ah) +
                '}';
    }

    public String[] getAh() {
        return ah;
    }

    public void setAh(String[] ah) {
        this.ah = ah;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
