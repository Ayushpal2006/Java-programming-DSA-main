public class Print_Num_N_to_1 {
    public static void main(String[] args) {
//        N_to_1(10);
        _1_to_N(10);
    }
    static void N_to_1(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        N_to_1(n-1);
    }

    static void _1_to_N(int n){
        if (n==0){
            return;
        }
        _1_to_N(n-1);
        System.out.println(n);
    }
}
