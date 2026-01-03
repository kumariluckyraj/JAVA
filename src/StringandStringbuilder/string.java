package StringandStringbuilder;

public class string {
    public static void main(String[] args) {
        //then what can we do to chnage a?
        String a="kunal";
        System.out.println(a);
        a="khushwaha";//you are not chnaging u are just creating a new obj
        System.out.println(a);

    }
    //StringandStringbuilder.string pool is a saperate memory in the heap which sores the data e.g->kunal
    //String a="kunal"
    //String b="kunal"
    //if a==b->true coz it is in the same pool
    //why a pool?
    //all the similar values does not get recreated i it is already there in the pool then it points to it so it is more optimizes
    //so if the obj of a is changed then b will also get changed?-> no coz it is immutable so u just cannot chnage anything
    //then what can we do to chnage a?

    //how to create different objects of same value
    //String a = new String("kunal");
    //String b = new String("kunal");
    //now if we do is a==b? ->false coz it is present out side the pool poiting at two diffrent obj that is kunal and kunal.
    //sout(a.equals(b));->true. but why? it we are using a function equals here


}
