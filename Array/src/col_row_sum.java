public class col_row_sum {
    public static void main(String[] args) {
        int max = 0;
        int maximum=0;
        int [][] arr={
                {0,1,8},
                {3,2,7},
                {6,3,9}
                    };
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            int pum=0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col]; // Row wise Sum
                pum=pum+arr[col][row];     //Col wise sum
            }
            if(sum>max){
                max=sum;
            }

            if(pum>maximum){
                maximum=pum;
            }
        }

        System.out.println("sum = " + max);
        System.out.println("pum = " + maximum);
    }
}
