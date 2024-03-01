package com.example.operate.thread;

public class StopThreadDemo {
    public static void main(String[] args){

        StopThread stopThread = new StopThread();
        Thread t1 = new Thread(stopThread);
        Thread t2 = new Thread(stopThread);

        t1.setDaemon(true);   //设置T1为守护线程，当所有前台线程结束后，这个结束
        t2.setDaemon(true);
        t1.start();
        t2.start();
        int x = 0;

        while(true){
            if(x == 60){
//                t1.interrupt();
//                t2.interrupt();
//                stopThread.changeFlag(false);
                break;
            }
            System.out.println(Thread.currentThread().getName()+"------"+x);
            x++;
        }

        System.out.println(" over ........");

    }
}

class StopThread implements Runnable{

    boolean flag = true;

    public void  changeFlag(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {

        while(flag){

//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println(Thread.currentThread().getName()+"------"+e.toString());
//                flag = false;
//            }

            System.out.println(Thread.currentThread().getName()+"------run....");
        }

        System.out.println("--ziThread is over....");

    }
}
