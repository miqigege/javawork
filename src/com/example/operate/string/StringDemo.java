package com.example.operate.string;

/**
 * 练习1：去除字符串两边的空格
 * 练习2：将字符串反转
 * 练习3：
 * 练习4：
 *
 */
public class StringDemo {

    public static void main(String[] args){

        String str1 = "1abcsdgai8235";  //常量
        String str2 = new String("abcsdgai8235"); //对象
        char c = str1.charAt(0);

        System.out.println("第0个字符是"+c);

        char[] chars = str1.toCharArray();
        for(int i=0; i<chars.length;i++){
            System.out.print(chars[i]);
        }
        System.out.println();

        int dg = str1.indexOf("dg");
        System.out.println("dg字符的位置是"+dg);


        boolean isTure = str1.endsWith("23wq");
        System.out.println("23wq是结尾吗？" +isTure);

        String[] as = str1.split("a");
        for(int i=0; i<as.length;i++){
            System.out.println(as[i]);
        }

        //获取子字符串
        String substring = str1.substring(4);
        System.out.println("子串是"+substring);
        //包含前面，不包含后面的字符串，也就是从2到7位置的字符子串
        String substring1 = str1.substring(2,8);
        System.out.println("11子串是"+substring1);
    }

}
