package StringandStringbuilder;

public class stringBuilder {
    public static void main(String[] args) {
        String series = "";
        for(int i =0; i<26; i++){
            char ch = (char)('a'+i);
            series=series+ch;
        }
        System.out.println(series);//converts al the char into StringandStringbuilder.string
        //but in this method everysingle time a new onjec will get created e.r: "a","ab","abc"..."abcdefghij.....z"
        //so this is not an efficient way
        //so instaed ofcreating a new obj every single time we can just add it in the end so we use stringbuilder
        //in stringbuilder only one obj is made and chnages is done in it and at the end it just adds it
        //check StringandStringbuilder.stringbuilder2 file for code
    }
}
