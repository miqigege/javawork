package com.example.operate.string;

/**
 * StringBuffer是一个字符串缓冲区，一个容器
 * C-create U-update R-read D-delete
 * 1，存储
 * stringBuffer appena()在字符串后面插入
 */
public class StringBufferDemo {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        StringBuffer append = sb.append(34);

        System.out.println(append.toString());
        System.out.println(sb.toString());
    }
}
