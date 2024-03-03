package com.example.operate.array;

/**
 * @Author hu
 * @Description 测试二分查找
 * @Date 2024/3/3 10:07
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {

        int[] array = {2,5,3,11,14,21,4,12,33,45,31,9};
        int[] sortArray = ArrayDemo.selectSortArray(array);
        //二分查找必须是引入排序的数组
        ArrayDemo.printArray(sortArray);
        int index = binarySearch(sortArray, 11);
        System.out.println("需要找的数为"+index);

    }

    /**
     * 二分查找——返回需要查找的数在数组中的位置
     * @param sortArray 有序的数组
     * @param key  需要查找的数
     * @return key在数组中的位置，没有为-1
     */
    private static int binarySearch(int[] sortArray, int key) {
        int min=0,max=sortArray.length-1,mid;
        while(min <=max){
            mid = (min + max)>>1;
            if(key > sortArray[mid]){
                min = mid+1;
            }else if(key < sortArray[mid]){
                max = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
