import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no");
        int num = in.nextInt();
        int sum = 0;

        while (num>0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum * 10 + rem;

            if (num==0)
                break;
        }
        System.out.println(sum + "" + "");

    }
}

