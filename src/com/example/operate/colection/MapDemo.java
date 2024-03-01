package com.example.operate.colection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 */
public class MapDemo {
    public static void main(String[] args){

//        Map<String,String> map = new HashMap<String,String>();
//
//        map.put("01","liasi1");
//        map.put("02","liasi2");
//        map.put("03","liasi3");
//        System.out.println("put:" + map.put("03","liasi311"));
//        map.put("04",null); //支持存入NULL，键为null也可以
//
//        baseOpeMap(map);
//
//        getMapKeySet(map);
//
//        getMapEntrySet(map);

        String str = "ags+dgdas3sghahd5ah-dfh";

        String resultStr = getStrCount(str);

        System.out.println("resultStr = "+resultStr);

    }

    /**
     * 输入一串字符串，输出该字符串中字母出现的次数
     * 格式：a(3)b(2)c(1)d(4)...
     * @param str  agsdgdassghahdahdfh
     * @return
     */
    private static String getStrCount(String str) {
        char[] chars = str.toCharArray();
        Map<Character,Integer> map = new HashMap<Character, Integer>();

        int count =0;
        for(int i=0; i<chars.length; i++){
            //保证字符串中的字母，非字母的元素过滤掉
            if(!((chars[i]>'a'&&chars[i]<'z')||(chars[i]>'A'&&chars[i]<'Z')))
               continue;
            Integer value = map.get(chars[i]);
//            System.out.println("inter = "+value);
            //map的K值唯一，当K值相同，再次存入V的时候，V覆盖
//            if(null ==value){
//                map.put(chars[i],1);
//            }else{
//                value++;
//                map.put(chars[i],value);
//            }
            //优化的写法
            if(null != value)
                count = value;
            count++;
            map.put(chars[i],count);
            count = 0;

        }
//        System.out.println("map = "+map);

        StringBuilder stringBuilder = new StringBuilder();

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            stringBuilder.append(next.getKey()+"("+next.getValue()+")");
        }

        return stringBuilder.toString();
    }

    /**
     * 将Map中的映射关系map.entry<k,v>取出，
     * @param map
     */
    private static void getMapEntrySet(Map<String, String> map) {

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println("key:"+key+",value = "+value);
        }

    }

    /**
     * keyset:把map中所有的键存入到Set集合，SET具备迭代器，使用迭代方式取出所有键，根据get获取每一个键对应的值
     * @param map
     */
    private static void getMapKeySet(Map<String, String> map) {
        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);

            System.out.println("key:"+key+",value = "+value);
        }

    }

    /**
     * map的基本操作——增删改查
     * @param map
     */
    private static void baseOpeMap(Map<String,String> map) {
        System.out.println("key判断："+map.containsKey("02"));
        System.out.println("value判断："+map.containsValue("liasi1"));
        System.out.println("存在判断："+map.size());
        System.out.println("："+map);

        System.out.println("key判断："+map.remove("01"));
        System.out.println("："+map);
        System.out.println("get："+map.get("03"));

        //获取map集合的所有值——使用for最新循环
        for (String value : map.values()) {
            System.out.print("value ："+value+" ");
        }
        System.out.println();
    }
}
