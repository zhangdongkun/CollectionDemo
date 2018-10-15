package main.java.test;

import main.java.collenction.stack.ArrayStack;
import main.java.collenction.stack.IStack;

import java.util.Date;
import java.util.HashMap;

public class StackTest {


    public static void main(String[] args) {
        IStack<String> iStack = new ArrayStack<String>();

        iStack.push("xxxx1");
        iStack.push("xxxx2");
        iStack.push("xxxx");

        System.err.println(new Date().hashCode());


        int i = 100000;


        Integer integer = Integer.valueOf(100);
        Integer integer2 = Integer.valueOf(100);

        //1
        System.out.println(integer2 == integer);

    }


}
