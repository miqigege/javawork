package com.example.operate.thread;

/**
 * 操作同一个资源，一个线程输入（交替输入资源的名字与性别），一个线程输出（不断取出输入的资源名字与性别）
 * ，当打印次数无限大，会出现线程安全问题（输入线程工作的时候还没结束，执行权被输出线程抢走
 * ------------线程间通信：等待唤醒机制（wait,notify,notifyALL）——jdk1.5新特性，lock与condition
 */
public class InputOutputTest {
    public static void main(String[] args){

        ResourceT res = new ResourceT();

        InputDataT indata = new InputDataT(res);
        OutputDataT outdata = new OutputDataT(res);

        Thread t1 = new Thread(indata);
        Thread t2 = new Thread(outdata);
        Thread t3 = new Thread(indata);
        Thread t4 = new Thread(outdata);
        t1.start();
        t3.start();
        t2.start();
//        t4.start();
    }
}

/**
 * 共享数据趣，对外提供了存入与取出的方法
 */
class ResourceT{
    String name;
    String sex;
    boolean flag = true;

    public  void input(String name,String sex){
        this.name = name;
        this.sex = sex;
//        System.out.println(Thread.currentThread().getName()+"-----存入： "+this.name + ",---"+this.sex);
    }


    public void output(){

        System.out.println(Thread.currentThread().getName()+"取出： "+name + "---======--"+sex);
    }
}

/**
 * 负责向公共数据区存入数据，
 * ----当多个线程操作
 */
class InputDataT implements Runnable{
    ResourceT res;
//    Object obj = new Object();

    InputDataT( ResourceT res){
        this.res = res;
    }
    @Override
    public void run() {
        int x=0;
        while(true){
            synchronized (res){

                if(res.flag)
                    try{res.wait();}catch (Exception e){}
                if(x==0)
                    res.input("Goodmen","nan");
                else
                    res.input("女人","女");
                x = (x + 1) % 2;

                res.flag = false;
                res.notify();
            }
        }
    }
}

/**
 * 负责从公共数据区取出数据，
 * -----
 */
class OutputDataT implements Runnable{
    ResourceT res;
//    Object obj = new Object();
    OutputDataT( ResourceT res){
        this.res = res;
    }
    @Override
    public void run() {

        while (true){
            synchronized (res){
                if(!res.flag)
                    try{res.wait();}catch (Exception e){}
                res.output();
                res.flag = true;
                res.notify();
            }

        }

    }
}