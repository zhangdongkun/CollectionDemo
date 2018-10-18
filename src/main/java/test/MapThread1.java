package main.java.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 验证hashmap的线程不安全性和，Collections.synchronizedMa，
 * ConcurrentHashMap
 */
public class MapThread1 extends  Thread {
  static   int m = 0;
//static   Map<String,String>   map = Collections.synchronizedMap( new HashMap<>(2));
    static  ConcurrentHashMap<String,String> map = new ConcurrentHashMap();

    @Override
    public void run() {
        for (int i = 0; i < 10;i++) {
        map.put(i+"",i+"");
        }

    }


    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 100;i++) {
                    map.put(i+"",i+"");
                }
            }
        };

        Thread thread2 = new Thread(){

            @Override
            public void run() {
                for(Map.Entry<String,String> entry : map.entrySet()){
                    System.out.println(entry.getKey() +"^" + entry.getValue());

                }
            }
        };

        thread1.start();
        thread2.start();


    }
}
