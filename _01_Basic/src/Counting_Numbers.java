import java.util.Scanner;

public class Counting_Numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=133221;
//        int n= in.nextInt();


        int Count=0;
        while(n>0) {
            int rem = n % 10;
            n=n/10;
            if (rem == 3) {
                Count = Count+1;

            }
        }
        System.out.println(Count + " ");

    }
}
