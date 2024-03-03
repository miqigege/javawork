package com.example.operate.array;

public class ArrayDemo {

    public static void main(String[] args){
        int[] arr = {3,14,5,11,7,6,9,13};

//        int arrayMax = getArrayMax(arr);
//        selectSortArray(arr);
//        bubbleSort(arr);
//        printArray(arr);
//        System.out.println("数组的最大值 为"+arrayMax);

        System.out.println(Integer.toBinaryString(60));
        System.out.println(Integer.toBinaryString(-60));
        System.out.println(Integer.toHexString(60));
        System.out.println(Integer.toHexString(-60));
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            if(i== arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+" ");
            }

        }
        System.out.println();
    }

    /**
     * 获取数组的最大值
     * @param arr  数组
     * @return  数组的最大值
     */
    public static int getArrayMax(int[] arr){
        int max = arr[0];
        for(int i=1; i< arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }


    /**
     * 冒泡排序——
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array){
        for(int x=0; x<array.length-1; x++){
            //-x：让每次比较的元素减少，-1：避免角标越界
            for(int y=0; y<array.length -x -1; y++){
                if(array[y] > array[y+1]){
                    int temp = array[y];
                    array[y] =  array[y+1];
                    array[y+1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 选择排序——将数组里面的元素从小到大排序
     * @param arr
     */
    public static int[] selectSortArray(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int y=i+1; y<arr.length; y++){
                if(arr[i]> arr[y]){
//                   int temp = arr[i];
//                    arr[i]= arr[y];
//                    arr[y]= temp;
                    //采用异或的方式，将两个数交换，效率更高
                    arr[i] = arr[i] ^ arr[y];
                    arr[y] = arr[i] ^ arr[y];
                    arr[i] = arr[i] ^ arr[y];
                }
            }
        }
        return arr;
    }

}
