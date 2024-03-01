package com.example.operate;

public class ExtendsDemo {


    public static void main(String[] args){
        Zi zi = new Zi();

    }
}
class Fu{
    Fu(){
        System.out.println(" fu  run ....");
    }
}
class Zi extends Fu{
    Zi(){
        System.out.println(" zi  run ....");
    }
}