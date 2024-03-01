package com.example.operate.colection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 去除arraylist中的重复元素（基本数据类型）
 * ----去除自定义对象（）同名同年龄视为同一个人，为重复元素
 */
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList al = new ArrayList();

//        al.add("java01");
//        al.add("java02");
//        al.add("java03");
//        al.add("java04");
//        al.add("java02");
//        al.add("java03");
//        System.out.println("原来的数据"+al);
//        ArrayList arrayList = singleElement(al);
//        System.out.println("新的"+arrayList);

        al.add(new Person("LISI001",18));
        al.add(new Person("LISI02",28));
        al.add(new Person("LISI02",28));
        al.add(new Person("LISI041",13));
        al.add(new Person("LISI005",38));

        ArrayList arrayList = singleElement(al);

        Iterator iterator = arrayList.iterator();

        while(iterator.hasNext()){
            Person person = (Person) iterator.next();
            System.out.println(person.getName()+":"+person.getAge());
        }

    }

    /**
     * 去除的基本数据类型——元素是否相同的判断依据是equal();
     * @param al
     * @return
     */
    private static ArrayList singleElement(ArrayList al) {
        ArrayList newAL = new ArrayList();

        Iterator iterator = al.iterator();

        while(iterator.hasNext()){
            Object next = iterator.next();

            if(!newAL.contains(next)){
                newAL.add(next);
            }
        }
        return newAL;
    }
}

class Person{
    private String name;
    private int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person) obj;
        return p.getName()==this.name&& p.getAge()==this.age;
    }

}
