package com.example.operate.colection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet的底层结构是二叉树，通过实现Comparable接口来实现
 *
 * 方式①自然排序
 * 方式②自己重写比较器
 */
public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet();

        treeSet.add(new Student("LISG01",48));
        treeSet.add(new Student("LISG03",18));
        treeSet.add(new Student("LISG02",28));
        treeSet.add(new Student("LISG05",38));
        treeSet.add(new Student("LISG02",28));

        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Student stu = (Student) iterator.next();
            System.out.println(stu.getName()+"---"+stu.getAge());
        }

    }
}

class Student implements Comparable{
    private String name;
    private int age;

    Student(String name, int age){

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {

        if(!(o instanceof Student))
            throw new RuntimeException("不是学生对象");
        Student stu = (Student) o;
        if(this.age > stu.age){
            return 1;
        }else if(this.age < stu.age){
            return -1;
        }else{
            return this.name.compareTo(stu.name);
        }

    }
}
