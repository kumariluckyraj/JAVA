import java.util.ArrayList;
import java.util.*;
public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//add the ascii value of a and b
        System.out.println("a"+"b");//o/p->ab
        System.out.println('a'+3);// ascii value of  d ('a'+3)
        System.out.println((char)('a'+3));//converts 100 into char->d
        System.out.println("a"+1);//int will be into integer that will call toString() so this is the same a a few steps: "a" +"1"
        System.out.println("Lucky"+ new ArrayList<>());
                                    //it is obj
        System.out.println("Lucky"+new Integer(56));
        //System.out.println(new Integer(56)+new ArrayList<>());->error
        //error coz operator + will be applied only if atleast one vale is string or premetive
        //operator - cannot be applied to string
    }
}
