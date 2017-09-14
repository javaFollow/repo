package com.baidu;

import java.util.List;

public class MyThread implements Runnable {
    private List<Integer> obj;
    private int a = 0;
    public MyThread(List<Integer> obj){
        this.obj = obj;
    }
    @Override
    public void run() {
                synchronized (obj){
                    while (true){
                try {
                    if (obj.isEmpty()) {
                        obj.wait();

                    } else {
                        obj.clear();
                        a++;
                        System.out.println("第" + a + "次清空。");
                        Thread.sleep(3000);
                        obj.notify();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                    }
                }

        }

}
