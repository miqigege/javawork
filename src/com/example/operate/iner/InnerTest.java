package com.example.operate.iner;

public class InnerTest {

    public static void main(String[] args){

        Outer outer = new Outer();
        //测试内部类在成员变量位置
        outer.show();
        //测试内部类在局部
        outer.show1();
        //测试匿名内部类
        outer.testAne();
    }
}
