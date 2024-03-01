package com.example.operate.colection;


import java.util.LinkedList;

/**
 * addFirst()
 * addLast()
 */
public class LinkedListDemo {
    public static void main(String[] args){

//        baseOperate1();

        linklistData();

    }

    /**
     * 使用linkedlist模拟一个堆栈或者队列的数据结构
     * 堆栈，先进后出，如同一个杯子
     * 队列，先进先出，如果一个水管
     */
    private static void linklistData() {

        Duilie duilie = new Duilie();
        duilie.myAdd("javad11");
        duilie.myAdd("javad12");
        duilie.myAdd("javad13");

        System.out.println(duilie.myGet());

    }

    private static void baseOperate1() {
        LinkedList linkedList = new LinkedList();

        linkedList.add("java01");
        linkedList.add("java02");
        linkedList.add("java03");
        linkedList.add("java04");

        System.out.println("add "+linkedList);

        linkedList.addFirst("java001");
        linkedList.addFirst("java002");
        linkedList.addFirst("java003");
        linkedList.addFirst("java004");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.removeFirst());


    }
}

class Duilie{
    private LinkedList linkedlist;

    Duilie(){
        linkedlist = new LinkedList();
    }

    public void myAdd(Object obj){
        linkedlist.addFirst(obj);
//        linkedlist.offerFirst(obj);
    }

    public Object myGet(){
        return linkedlist.getLast();
//        return linkedlist.peekFirst();
    }
    public boolean isNull(){
       return linkedlist.isEmpty();
    }



}
