public class richest_customer_wealth {
    public static void main(String[] args) {
        int acc[][] = {{1, 2, 30}, {9, 1, 6}, {3, 3, 7}};
        System.out.println(Richest(acc));

    }

    static int Richest(int acc[][]) {
        int max = 0;
        for (int row = 0; row < acc.length; row++) {
            int sum = 0;
            for (int col = 0; col < acc[row].length; col++) {
                sum = sum + acc[row][col];
            }
        if(sum>max){
            max=sum;
        }
        }
    return max;
    }
}
