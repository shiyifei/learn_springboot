package com.example.springboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="person")
public class PersonProperties {
    private String name;
    private Integer age;
    private String sponse;
    private PersonProperties[] children;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSponse() {
       return sponse;
    }

    public void setSponse(String sponse) {
        this.sponse = sponse;
    }

    public PersonProperties[] getChildren() {
        return this.children;
    }

    public void setChildren(PersonProperties[] children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "name:" + name + ",age:" + age + ",sponse:" + sponse;
    }
}
