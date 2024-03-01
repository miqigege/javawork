package com.example.operate.colection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args){
//        sortDemo();

//        maxDemo();

        binarySearchDemo();
    }

    private static void binarySearchDemo() {
        ArrayList<String> alstr = new ArrayList<>();
        alstr.add("asa");
        alstr.add("aaaa");
        alstr.add("bbb");
        alstr.add("csdag");
        alstr.add("csaag");
        alstr.add("dssss");
        alstr.add("ddddd");
        alstr.add("zz");
        System.out.println(alstr);
        int index = Collections.binarySearch(alstr,"ccc");
        System.out.println("jiaobio = "+index);
    }

    private static void maxDemo() {
        ArrayList<String> alstr = new ArrayList<>();
        alstr.add("asa");
        alstr.add("aaaa");
        alstr.add("bbb");
        alstr.add("csdag");
        alstr.add("csaag");
        alstr.add("dssss");
        alstr.add("ddddd");
        alstr.add("zz");
        System.out.println(alstr);
        String max = Collections.max(alstr);
        System.out.println("zuida "+max);
    }

    /**
     * 通过collections.sort（）方法对list列表中的数据进行自然排序
     */
    private static void sortDemo() {
        ArrayList<String> alstr = new ArrayList<>();
        alstr.add("asa");
        alstr.add("aaaa");
        alstr.add("bbb");
        alstr.add("csdag");
        alstr.add("csaag");
        alstr.add("dssss");
        alstr.add("ddddd");

        System.out.println(alstr);
//        Collections.sort(alstr);
        Collections.sort(alstr,new StrLenComparator()); //传入自定义比较器，根据字符串长度排序
        System.out.println("排序后"+alstr);

    }
}

class StrLenComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() > o2.length()){
            return 1;
        }else if(o1.length() < o2.length()){
            return -1;
        }else
            return o1.compareTo(o2);
    }
}