public class palindrom {
    public static void main(String[] args) {
        String str= "abcdcba";
        int start =0;
        int end= str.length()-1;

        boolean isPalindrome=true;
        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }else{
                isPalindrome=false;
                break;
            }

        }
        if(isPalindrome){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }


    }
    // a    b c d c b  a
    //start           end
    //is start==end->yes s++(b) and e--(b)
    //s==e?->yes s++(c) e--(c)
    //s==e->yes s++(d) e--(d)
    //s==e->yes s++ and e-- here(s>e)->stop loop ends
}
