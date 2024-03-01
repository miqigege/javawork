package com.example.operate;

public class OperateDemo {
    public static void main(String[] args){
//        int a = 4232;
//        a = a / 1000 * 1000;
//        System.out.println(a);

        //取模运算——左边数大于右边，取模为1,；小于右边取模为本身，相等取模为0；负数的时候，取决于前面的符号
//        System.out.println(5%2);
//        System.out.println(2%5);
//        System.out.println(5%5);
//        System.out.println(-5%2);
//        System.out.println(2%-5);
//        System.out.println(-2%-2);

//        int a = 3 , b ;
//        //++算术运算符代表将a里面的数值加一并赋值给a
//     //   b = a++;//a 先赋值然后在自己运算
//        b = ++a; // a  先运算然后在赋值
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println("5+5 = "+5 + 5 );

        //赋值运算符
       // short s = 4;
        //编译报错，两步运算（s+4提升为int类型，无法赋值给short类型）
     //   s = s +5;
       // s +=5;

        //将两个数更换，不适用第三方变量
        int m =3 , n =8;
        m = m ^ n ; // m = 3 ^ 8 = 11
        n = m ^ n;   //  n =  3 ^ 8 ^ 8 = 3
        System.out.println("1----m = "+m+", n ="+n);
        m = m ^ n;  // m = 3 ^ 8 ^ 3 = 8
        System.out.println("m = "+m+", n ="+n);

    }
}
