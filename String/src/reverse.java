import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        String name="Ayush Pal";
        System.out.println(reverse(name));
    }
    static String reverse(String str){
        char []ch=str.toCharArray();
        int start=0;
        int end=ch.length-1;
        while (end>=start){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        String str1="";
        String ans=str1.valueOf(ch);
        return ans;
    }
}
