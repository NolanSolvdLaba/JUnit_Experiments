package org.example;

public class Form {
    private String name;
    private int age;
    private String email;

    public Form(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
