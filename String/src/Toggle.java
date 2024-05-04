import java.util.Optional;

public class Toggle {
    public static void main(String[] args) {
        String name="Ayush Pal";
        System.out.println(func(name));
        System.out.println(func2(name));
    }
    static String func(String str){
        String str1="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch>=97){
                str1=str1+(char) (ch-32);
            }else {
                str1=str1+ (char)(ch+32);
            }
        }
        return str1;
    }

    static String func2(String str){
        String str1="";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (Character.isUpperCase(ch)){
                str1=str1+Character.toLowerCase(ch);
            }else {
                str1=str1+Character.toUpperCase(ch);
            }
        }
        return str1;
    }
}
