package com.example.operate.colection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * map练习：每个学生都有对应的归属地，学生student,地址string
 * 学生属性：姓名，年龄。
 * 注意：姓名和年龄相同的视为同一个学生，保证学生的 唯一性
 */
public class MapTest {
    public static void main(String[] args){

        HashMap<StudentMAP,String> hm = new HashMap<StudentMAP,String>();
        hm.put(new StudentMAP("lisic1",23),"山东");
        hm.put(new StudentMAP("lisic2",25),"beijing");
        hm.put(new StudentMAP("lisic2",33),"nanjing");
        hm.put(new StudentMAP("lisic3",23),"hebei");

        //entrySet方式获取
//        Set<Map.Entry<StudentMAP, String>> entries = hm.entrySet();
//        Iterator<Map.Entry<StudentMAP, String>> iterator = entries.iterator();
//        while(iterator.hasNext()){
//            Map.Entry<StudentMAP, String> next = iterator.next();
//            StudentMAP key = next.getKey();
//            String value = next.getValue();
//            System.out.println("key = "+key.getName()+":"+key.getAge()+",value = "+value);
//        }

        //通过keyset方式获取
        Set<StudentMAP> studentMAPS = hm.keySet();
        Iterator<StudentMAP> iterator1 = studentMAPS.iterator();
        while(iterator1.hasNext()){
            StudentMAP next = iterator1.next();
            String value = hm.get(next);
            System.out.println("key = "+next.getName()+":"+next.getAge()+",value = "+value);
        }

    }
}

class StudentMAP implements Comparable<StudentMAP>{

    private String name;
    private int age;

    StudentMAP(String name,int age){
        this.name =name;
        this.age = age;
    }

    /**重写hashcode,确保唯一性
     * @return
     */
    public int hashCode(){
        return name.hashCode() +age*34;
    }
    public boolean equals(Object obj){
        if(! (obj instanceof StudentMAP)){
            throw new RuntimeException("类型不匹配");
        }
        StudentMAP stu = (StudentMAP) obj;
        return  this.name.equals(stu.name) && this.age==stu.age;
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

    /**
     * 让该对象具有自然排序
     * @param o
     * @return
     */
    @Override
    public int compareTo(StudentMAP o) {

        int num = new Integer(this.age).compareTo(new Integer(o.age));
        if(num ==0)
            return this.name.compareTo(o.name);
        return num;
    }
}
