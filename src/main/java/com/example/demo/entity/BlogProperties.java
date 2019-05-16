package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties {

    @Value("${com.didispace.blog.name}")
    private String name;

    @Value("${com.didispace.blog.title}")
    private String title;

    @Value("${com.didispace.blog.desc}")
    private String desc;

    @Value("${com.didispace.blog.value}")
    private String randomValue;

    @Value("${com.didispace.blog.number}")
    private String randomInt;

    @Value("${com.didispace.blog.bignumber}")
    private String randomLong;

    @Value("${com.didispace.blog.test1}")
    private String randomIntTest;

    @Value("${com.didispace.blog.test2}")
    private String randomIntTest1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRandomValue() {
        return randomValue;
    }

    public void setRandomValue(String randomValue) {
        this.randomValue = randomValue;
    }

    public String getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(String randomInt) {
        this.randomInt = randomInt;
    }

    public String getRandomLong() {
        return randomLong;
    }

    public void setRandomLong(String randomLong) {
        this.randomLong = randomLong;
    }

    public String getRandomIntTest() {
        return randomIntTest;
    }

    public void setRandomIntTest(String randomIntTest) {
        this.randomIntTest = randomIntTest;
    }

    public String getRandomIntTest1() {
        return randomIntTest1;
    }

    public void setRandomIntTest1(String randomIntTest1) {
        this.randomIntTest1 = randomIntTest1;
    }
}
