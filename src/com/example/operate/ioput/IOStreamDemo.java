package com.example.operate.ioput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamDemo {
    public static void main(String[] args){
//        createFileWirterDemo();

//        readFromFile();

        copyFile();

    }

    /**
     * 复制一个文件
     */
    private static void copyFile() {
        FileReader freader = null;
        FileWriter fwriter = null;
        try {
            freader = new FileReader("Text.txt");
            char[] ch = new char[1024];

            int readLen = freader.read(ch);

//            while(readLen!=-1){
            String strContent = new String(ch, 0, readLen);
            System.out.println("文件的内容 "+strContent);

            fwriter = new FileWriter("test.txt");
            fwriter.write(strContent);
//            }

            fwriter.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件找不到异常 "+e.toString());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读取异常 "+e.toString());
        }finally {
            if(null != freader){
                try {
                    freader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("读取关闭异常 "+e.toString());
                }
            }else if(null != fwriter){
                try {
                    fwriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("读取关闭异常 "+e.toString());
                }
            }
        }
    }

    /**
     * 从文件中读取数据
     */
    private static void readFromFile() {
        FileReader freader = null;
        try {
            freader = new FileReader("Text.txt");
            char[] ch = new char[1024];

            int readLen = freader.read(ch);

//            while(readLen!=-1){
                String strContent = new String(ch, 0, readLen);
                System.out.println("文件的内容 "+strContent.toString());
//            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件找不到异常 "+e.toString());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("读取异常 "+e.toString());
        }finally {
            if(null != freader){
                try {
                    freader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("读取关闭异常 "+e.toString());
                }
            }
        }
    }

    /**
     * 创建一个文件，并向文件中写入数据
     */
    private static void createFileWirterDemo() {
        FileWriter fw = null;

        try {
            fw = new FileWriter("Text.txt");
            fw.write("text  java  I  come here...\n");
            fw.write("我来了");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("写入异常 "+e.toString());
        }finally {
            if(null != fw){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("关闭异常 "+e.toString());
                }
            }
        }


    }
}
