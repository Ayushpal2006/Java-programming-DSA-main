import java.util.Scanner;

public class Amstrong_numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number :" + "  ");
        int n=in.nextInt();
        int a=n;
        int sum=0;

        while(n>0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;

        }
        if(sum==a){
            System.out.println("This is Armstrong_number");
        }
        else{
            System.out.println("This is not Armstrong number");
        }

    }
}
