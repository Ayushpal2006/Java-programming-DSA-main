import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number  : " + " ");
        int n =in.nextInt();
        int Fact=1;

        if(n==0)
            System.out.println("Factorial = " + "1");
        else {
            for (int i = 1; i <= n; i++) {
                Fact = Fact * i;
            }
            System.out.println("Factorial = " + Fact);
        }

    }
}
