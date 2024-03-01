package com.example.operate.thread;

import java.util.TimerTask;

public class TreadDemo {

    public static void main(String[] args){

        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
//        Thread t3 = new Thread(ticket);

        t1.start();
        try {
            Thread.sleep(10); //增加这个突出线程安全问题
        } catch (Exception e) {
        }
        ticket.flag = false;
        t2.start();
//        t3.start();

    }
}

/**
 * 练习四个售票员卖票——一共一百张票
 *
 */
class Ticket implements Runnable{
    private static int ticketSum = 100;

    boolean flag = true;
    @Override
    public void run() {

        if(flag){ //让线程1先进来执行
            while(true){
                synchronized (this) {
                    if (ticketSum > 0) {
                        try {
                            Thread.sleep(10); //增加这个突出线程安全问题
                        } catch (Exception e) {
                        }
                        System.out.println(Thread.currentThread().getName() + "（code）卖出票号码为" + ticketSum--);
                    }
                }
            }
        }else{//线程2执行
            while (true)
               show();
        }


    }

    /**
     * 同步函数，锁对象是this
     * 静态同步函数，锁对象是函数所在类的字节码对象
     */
    public synchronized void show(){

        if (ticketSum > 0) {
            try {
                Thread.sleep(10); //增加这个突出线程安全问题
            } catch (Exception e) {

            }
            System.out.println(Thread.currentThread().getName() + "(同步函数)卖出票号码为" + ticketSum--);
        }
    }




}