package com.baidu;

public class Hello {
    private String name;
    private Integer age;
    private String address;
    private String hobby;
    public String getName() {
        System.out.println("111");
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
    public void sayBye(){
        System.out.println("再见，" + this.name);
    }
    public void introduceHobby(){
        System.out.println("我的爱好是" + this.hobby);
    }
    public void testMethod(){
        System.out.println("这是什么啊666");
    }
}
