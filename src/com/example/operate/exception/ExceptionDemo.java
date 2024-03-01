package com.example.operate.exception;

public class ExceptionDemo {

    public static void main(String[] args){
        int result =0;
        try {
            Demo demo = new Demo();
            result = demo.div(4, 0);
        }catch (Exception e){
            if(e instanceof ArithmeticException){
                System.out.println("ArithmeticException = "+e.toString());
            }else if(e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("ArrayIndexOutOfBoundsException = "+e.toString());
            }
        }

//        }catch ( ArrayIndexOutOfBoundsException E){
//            E.printStackTrace();
//        }catch(ArithmeticException e){
//            e.printStackTrace();
//        }

        System.out.println("result = "+result);


    }


}
  class Demo{

     int div(int m, int n ) throws ArrayIndexOutOfBoundsException,ArithmeticException{
         int[] arr = new int[m];
         System.out.println(arr[4]);
         return  m/n;
     }
  }