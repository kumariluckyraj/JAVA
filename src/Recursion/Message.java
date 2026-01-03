package Recursion;

public class Message {
    public static void main(String[] args) {
        msg(); //1.msg will be called
        //9. msg() will come out
    }
    static void msg(){
        System.out.println("hey");
        msg1(); //2.after excecuting msg() msg1() will be called
        //8.mas1() will come out and msg is finished so it will come out from where it is called
    }
    static void msg1(){
        System.out.println("hey");
        msg2(); //3.after exceuting msg1() msg2() will be called
        //7.msg2() will come out and msg2() is finsished so it will come out from where it is called
    }
    static void msg2(){
        System.out.println("hey");
        msg3();//4.after msg2() msg3() will be called
        //6.msg3() will come out and msg2() is also finisished so it will come out from where it is called
    }
    static void msg3(){
        System.out.println("hey");//5.after msg3 has executed it will come out from msg3 as it is called there
    }

}
