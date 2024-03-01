package com.example.operate.colection;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("java01");
        al.add("java02");
        al.add("java03");
        al.add("java01");

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(6);
        al1.add(7);
        al1.add(9);

        printData1(al1);
        printData1(al);

    }

    /**  ?为占位符，不明确类型
     * 通过泛型限定来  输出不同类型的  列表
     * @param arrayList
     */
    private static void printData(ArrayList<?> arrayList) {
        Iterator<?> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


    /**
     *
     * @param arrayList
     * @param <T>
     */
    private static <T> void printData1(ArrayList<T> arrayList) {
        Iterator<T> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
