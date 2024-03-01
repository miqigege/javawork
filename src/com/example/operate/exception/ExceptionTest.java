package com.example.operate.exception;

/**
 * 毕老师用电脑上课，电脑故障（1-重启，2-蓝屏，3-冒烟）
 */
public class ExceptionTest {

    public static void main(String[] args){

        Teacher teacher = new Teacher("毕老师");
        try{
            teacher.lecture();
        }catch (NoStudynException e){
            System.out.println("更换设备。。。。或下课");
        }

    }
}

class Teacher{
    private String name;
    Computer cmpt;
    Teacher(String name){
        this.name = name;
        cmpt = new Computer();
    }

    void lecture() throws NoStudynException{
        try{
            cmpt.run();
            System.out.println(name+"讲课。。。。");
        }catch(Exception e){
            if(e instanceof LanPingException)
                System.out.println(e.toString());
            else if(e instanceof MaoyanException)
                //电脑冒烟之后，这里无法处理，只能重新自定义异常抛给上级处理
                System.out.println(e.toString());
                throw new NoStudynException("电脑冒烟，无法上课。。。。");
        }

    }

}

class Computer{

    int state = 3;
    void run() throws LanPingException,MaoyanException{
        System.out.println("电脑运行。。。。");
        switch(state){
            case 1:
                reset();
            case 2:
                state =1;
                lanPing();
            case 3:
                maoyan();
            case 0:
                run();
        }
    }

    void reset(){
        System.out.println("电脑重启。。。。");
    }

    void lanPing() throws LanPingException{

        throw new LanPingException("COPuter is lanping");
    }

    void maoyan() throws MaoyanException{
        throw new MaoyanException("COPuter is maoyan");
    }

}

class LanPingException extends  Exception{

    LanPingException(String msg){
        super(msg);
    }

}
class MaoyanException extends  Exception{

    MaoyanException(String msg){
        super(msg);
    }

}

/**
 * 冒烟异常，电脑异常，调用者处理不了，可以新建一个无法上课的异常，让
 * 调用者择机处理（更换电脑或下课做练习）
 */
class NoStudynException extends  Exception{

    NoStudynException(String msg){
        super(msg);
    }

}