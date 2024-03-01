package com.example.operate.colection;

public class RegexDemo {
    public static void main(String[] args){


//        matchMethod();

        splitDemo("sagssididiiosnnxzdf","(.)\\1");
//        splitDemo("zhagnsan.lisi.wagnwu","\\.");
//        splitDemo("c:\\sagwngx\\sag\\stx.txt","\\\\");

    }

    /**
     * 正则表达式分割Demo
     * @param str  要分割的字符串
     * @param regex  分割的规则
     */
    private static void splitDemo(String str, String regex) {
        String[] split = str.split(regex);
        for(String str1 : split){
            System.out.println(str1);
        }

    }

    /**
     * 正则表达式匹配
     */
    private static void matchMethod() {
        String str = "bAM";
//        String regex = "[bcd][A-Z]\\d";
        String regex = "[bcd][A-Z]\\w";
        boolean matches = str.matches(regex);
        System.out.println("是否满足： "+matches);
    }
}
