package com.example.operate.thread;

/**面试：写一个死锁代码
 * 死锁——同步中嵌套同步，锁不同
 */
public class DeadLockDemo {

    public static void main(String[] args){


        Thread  t1 = new Thread(new DeadThread(true));
        Thread  t2 = new Thread(new DeadThread(false));
        t1.start();
        t2.start();
    }

}

class MyLock{
    static Object lockA = new Object();
    static Object lockB = new Object();
}

 class DeadThread implements Runnable{
    boolean flag;

    protected DeadThread(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (MyLock.lockA){

                    System.out.println("if locka .....");
                synchronized (MyLock.lockB){
                    System.out.println("if lockb .....");
                }
            }
        }else{
            synchronized (MyLock.lockB){

                System.out.println("else lockb .....");
                synchronized (MyLock.lockA){
                    System.out.println("else locka .....");
                }
            }
        }
    }
}