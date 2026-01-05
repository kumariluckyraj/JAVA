package Recursion.StringSubsetSubsequence;

public class Stream {
    public static void main(String[] args) {
        System.out.println(skipApple("baccaappled"));
    }
    //p->processed
    //up->unprocessed
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));// p will be as it is but up wil remove the first char
        }else{
           skip(p+ch,up.substring(1));//p will add 0th index char if the char is not a
        }

    }

    static String skip(String up){
        if(up.isEmpty()){

            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
           return  skip(up.substring(1));// p will be as it is but up wil remove the first char
        }else{
            return ch+skip(up.substring(1));//p will add 0th index char if the char is not a
        }


    }
    //skip("baccad")
    //│
    //├─ ch = 'b' (keep)
    //│  return 'b' + skip("accad")
    //│
    //│   skip("accad")
    //│   │
    //│   ├─ ch = 'a' (skip)
    //│   │  return skip("ccad")
    //│   │
    //│   │   skip("ccad")
    //│   │   │
    //│   │   ├─ ch = 'c' (keep)
    //│   │   │  return 'c' + skip("cad")
    //│   │   │
    //│   │   │   skip("cad")
    //│   │   │   │
    //│   │   │   ├─ ch = 'c' (keep)
    //│   │   │   │  return 'c' + skip("ad")
    //│   │   │   │
    //│   │   │   │   skip("ad")
    //│   │   │   │   │
    //│   │   │   │   ├─ ch = 'a' (skip)
    //│   │   │   │   │  return skip("d")
    //│   │   │   │   │
    //│   │   │   │   │   skip("d")
    //│   │   │   │   │   │
    //│   │   │   │   │   ├─ ch = 'd' (keep)
    //│   │   │   │   │   │  return 'd' + skip("")
    //│   │   │   │   │   │
    //│   │   │   │   │   │   skip("")
    //│   │   │   │   │   │   └─ return ""



    //to skip string instead of a char
    static String skipApple(String up) {
        if (up.isEmpty()) {

            return "";
        }

        if (up.startsWith(("apple"))) {
            return skipApple(up.substring(5));// p will be as it is but up wil remove the first char
        } else {
            return up.charAt(0)+ skipApple(up.substring(1));//p will add 0th index char if the char is not a
        }
    }

    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {

            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));// p will be as it is but up wil remove the first char
        } else {
            return up.charAt(0)+ skipAppNotApple(up.substring(1));//p will add 0th index char if the char is not a
        }
    }
}
