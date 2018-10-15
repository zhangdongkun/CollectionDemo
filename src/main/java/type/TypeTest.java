package main.java.type;

import main.java.collenction.stack.Node;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TypeTest {
    /**
     * 测试 范型占位符
     * @param list
     */
    public   void printList(List<?> list){
        Iterator<?>it  = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    /**
     * 编写一个范型方法
     * @param k
     * @param <K>
     */
    public <K> void  type1(K k){
        System.out.println(k);
    }

    public static void main(String[] args) {

        Node node1 = new Node();
        node1.setData("11111");
        Node node2 = new Node();
        node2.setData("22222");
        Node node3 = new Node();
        node3.setData("3333");
        node1.next = node2;
        node2.next = node3;
        node3.next = null;


         Node head = node1;
        while (head !=null){
            System.out.println(head.getData());
            head = head.next;

        }


    }


}
