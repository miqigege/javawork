package com.example.operate.iner;

public class Outer {
    private int num =5;
    void show(){
        Inter inter = new Inter();
        inter.display();
        System.out.println("outer run...");
    }
    //测试匿名内部类的方法
    void testAne(){
        new AbsDEMO(){

            @Override
            public void show() {
                System.out.println("AbsDEMO匿名内部类 run...");
            }
        }.show();
    }

    void show1(){

        int test =7;
        //内部类在局部变量位置
        class IntertestA{

            void fucktion(){

                System.out.println("Intertest run..." +num+",test = "+test);
            }
        }

        new IntertestA().fucktion();
    }

    //内部类在成员变量位置
    class Inter{

        void display(){
            System.out.println("INTER run..." +num);
        }

    }

}

interface AbsDEMO{
    void show();
}
