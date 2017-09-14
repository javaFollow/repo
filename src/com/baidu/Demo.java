package com.baidu;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public void test(){
        System.out.println("你好");
    }

    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<Integer>();
        Thread thread1 = new Thread(new MyThread(obj));
        Thread thread2 = new Thread(new HerThread(obj));
        thread1.start();
        thread2.start();
    }
}
