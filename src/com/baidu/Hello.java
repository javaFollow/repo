package com.baidu;

public class Hello {
    private String name;
    private Integer age;
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

    public void sayHello(){
        System.out.println(this.name + ",你好");
    }
    public void sayBye(){
        System.out.println("再见，" + this.name);
    }
}
