public class palidrome {
    public static void main(String[] args) {
        String a="Madam";
        System.out.println(isPalidrome(a));
    }
    static Boolean isPalidrome(String str1){
        String str=str1.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            int s=i;
            int e=str.length()-1-i;
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
        }
    return true;
    }

}
