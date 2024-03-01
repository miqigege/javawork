package com.example.operate.thread;

public class SingleDemo {
    public static void main(String[] args){

    }

    /**
     * 饿汉式设计模式，单例
     */
    static class Single{
        private static final Single single =new Single();
        private Single(){
        }
        public static Single getSingle(){
            return single;
        }
    }

    /**
     * 懒汉式设计模式（延迟加载），单例——多线程访问时，容易产生线程安全问题
     * 使用双重判断+锁的问题，解决效率问题。使用的锁是类的字节码对象
     */
    static class Single1{
        private static  Single1 single1 =null;
        private Single1(){
        }
        public static Single1 getSingle(){

            if(single1==null){
                synchronized (Single1.class){
                    if(single1==null)
                        single1 = new Single1();
                }
            }
            return single1;
        }
    }

}
