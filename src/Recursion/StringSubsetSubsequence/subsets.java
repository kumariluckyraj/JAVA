package Recursion.StringSubsetSubsequence;

import java.util.ArrayList;

public class subsets {
    public static void main(String[] args) {
      subseqascii("","abc");
        //System.out.println(subseqRet("","abc"));

    }

    //subset of [3,5,9]->[3],[3,5],[3,9] here the elemets may or may not be continues or adjacent
    //str="abc"
    //ans=["a","b","c","ab","ac","bc","abc"]
    //this pattern of taking some element and removing some is known as this subset pattern
    //subset is for arrays and subseq is for str

    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));//add it
        subseq(p,up.substring(1));//ignore it


    }

    static ArrayList<String> subseqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left=subseqRet(p+ch,up.substring(1));//add it
        ArrayList<String> right= subseqRet(p,up.substring(1));//ignore it
        left.addAll(right);
        return left;

    }

//also return the ascii value
    static void subseqascii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqascii(p+ch,up.substring(1));//add it
        subseqascii(p,up.substring(1));//ignore it

        subseqascii(p+(ch+0),up.substring(1));// this will give the ascii value
    }


}
