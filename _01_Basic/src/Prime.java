import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    
    
    System.out.println("Enter the number");
    int n=in.nextInt();
    int ans= Prime(n);
    System.out.println(ans);
    
    }
    
 
    static int Prime(int n){
        int c=2;
    if(n==0 || n==1){
        System.out.println("not prime");
    }if (n%c==0){
        System.out.println("not prime");
            c++;
    }else{
        System.out.println(" prime");
    }

        return 0;
    }
    
  
}
