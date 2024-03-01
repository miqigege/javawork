package com.example.operate.colection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args){


        HashSet hashSet = new HashSet();

        hashSet.add("java001");
        hashSet.add("java002");
        hashSet.add("java003");
        hashSet.add("java004");
        hashSet.add("java004");
        hashSet.add("java004");

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println("sssgag==="+iterator.next());
        }

    }
}
