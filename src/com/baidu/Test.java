package com.baidu;

public class Test {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.setName("张三");
        String name = hello.getName();
        System.out.println(name);
    }
}
