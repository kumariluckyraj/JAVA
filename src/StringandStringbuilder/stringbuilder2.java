package StringandStringbuilder;

public class stringbuilder2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);//adds it
        }
        System.out.println(builder.toString());//convert to StringandStringbuilder.string
        //stringbuilder is immutable
    }
}
