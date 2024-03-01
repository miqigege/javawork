package com.example.operate;

public class ForTest {

    public static void main(String[] args){
        //获取1-10的和，并打印
//        int sum = 0;
//        for(int i=1; i<=10; i++){
//            sum = sum +i;
//        }
//        System.out.println("sum = "+sum);

        //1-100之间7的倍数的个数，并打印
//        int num=0;
//        for (int i =1; i<100; i++){
//            if(i%7==0){
//                num++;
//                System.out.println("i = "+i);
//            }
//        }
//        System.out.println("num = "+num);


        /**
         * 循环嵌套的作业：  打印下面的图形
         * 88888
         * 8888
         * 888
         * 88
         * 8
         *
         */

        for(int i=0; i<5; i++){
            for(int y=5;y>i;y--){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
