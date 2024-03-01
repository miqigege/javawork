package com.example.operate.thread;

/**
 * 有一处公共资源，一个线程负责输入，一个线程负责输出，
 */
public class InputOutputDemo {
    public static void main(String[] args){

        Resource res = new Resource();

        InputData indata = new InputData(res);
        OutputData outdata = new OutputData(res);

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
class Resource{
    String name;
    String sex;

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
class InputData implements Runnable{
    Resource res;
//    Object obj = new Object();
    InputData( Resource res){
        this.res = res;
    }
    @Override
    public void run() {
        int x=0;
        while(true){
            synchronized (res){
                if(x==0)
                    res.input("Goodmen","nan");
                else
                    res.input("女人","女");
                x = (x + 1) % 2;
            }
        }
    }
}

/**
 * 负责从公共数据区取出数据，
 * -----
 */
class OutputData implements Runnable{
    Resource res;
//    Object obj = new Object();
    OutputData( Resource res){
        this.res = res;
    }
    @Override
    public void run() {

        while (true){
            synchronized (res){
                res.output();
            }

        }

    }
}