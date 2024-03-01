package com.example.operate.colection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * add方法的参数是object，
 */
public class CollectionDemo {

    public static void main(String[] args){

//        baseOperate();

//        method_2();

        methodGet();

    }

    /**
     * 通过迭代器来获取元素
     */
    private static void methodGet() {
        ArrayList arrayList = new ArrayList();
//
        arrayList.add("023120");
        arrayList.add("023121");
        arrayList.add("023122");
        arrayList.add("023123");
        arrayList.add("023124");

        Iterator iterator = arrayList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    /**
     * 对两个元素取交集
     */
    public static void method_2(){
        ArrayList arrayList1 = new ArrayList();

        arrayList1.add("023120");
        arrayList1.add("023121");
        arrayList1.add("023122");
        arrayList1.add("023123");
        arrayList1.add("023124");

        ArrayList arrayList2 = new ArrayList();

        arrayList2.add("023120");
        arrayList2.add("023121");
        arrayList2.add("023125");
        arrayList2.add("02316");
        arrayList2.add("023128");

        //取两个集合中的交集然后存到该集合中
        arrayList1.retainAll(arrayList2);
        System.out.println("列表的长度为 "+arrayList1.size()+", dayin "+arrayList1);

        System.out.println("列表的长度为 "+arrayList2.size()+", dayin "+arrayList2);
    }


    /**
     * 对arraylist进行增删操作
     */
    public static void baseOperate(){

        ArrayList arrayList = new ArrayList();
//
        arrayList.add("023120");
        arrayList.add("023121");
        arrayList.add("023122");
        arrayList.add("023123");
        arrayList.add("023124");

        System.out.println("列表的长度为 "+arrayList.size()+", dayin "+arrayList);

        //删除元素
        arrayList.remove(1);
//        arrayList.clear();
//        arrayList.remove("023121");
        System.out.println("列表的长度为 "+arrayList.size()+", dayin "+arrayList);

    }

}
