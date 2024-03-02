public class Swap_Without_3rd_variable {
    public static void main(String[] args) {
       int a=2;
       int b=3;
        System.out.println("before  swap :"+ "a = "+ a +",  b = "+ b );
        System.out.println(swap(a,b));
    }

    static int swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after  swap :"+ "a = "+ a +",  b = "+ b );

        return 0;
    }
}
