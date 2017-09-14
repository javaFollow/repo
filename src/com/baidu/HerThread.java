package com.baidu;

import java.util.List;

public class HerThread implements  Runnable {
    private List<Integer> obj;
    private int a = 0;
    public HerThread(List<Integer> obj){
        this.obj = obj;
    }
    @Override
    public void run() {
                synchronized (obj){
                    while (true) {
                    try {
                        if (obj.isEmpty() == false) {
                            obj.wait();
                        } else {
                            obj.add(1);
                            a++;
                            System.out.println("第" + a + "次增加。");
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
