package com.springbootsecurityoauth2example.model;

public class User {


    private long id;

    private String username;

    private String password;

    private long salary;

    private int age;

    public User(long id, String username, String password, long salary, int age) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salary = salary;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}