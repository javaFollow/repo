package com.baidu;

public class Hello {
    private String name;
    private Integer age;
    private String address;
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void sayHello(){
        System.out.println(this.name + ",你好");
    }
}
