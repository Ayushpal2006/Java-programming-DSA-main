//square pattern

public class pattern2 {
    public static void main(String[] args){
    pat1(5);
    }

    static void pat1(int n){
        for(int row=0;row<=n;row++){
            //for envery row, run the col;
            for(int col=0;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}