package com.Example.DockerComposeDemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Profile")
public class Profile {

    @Id
    int id;
    String name;
    int age;

    public Profile(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Profile() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
