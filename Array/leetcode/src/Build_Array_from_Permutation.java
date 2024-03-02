import java.util.Arrays;

public class Build_Array_from_Permutation {
    public static void main(String[] args) {

        int[] nums ={0,2,1,5,3,4};
        int n = nums.length;
        int[] ans = new int[n];
//        nums[5] = 22;
        for(int i=0; i<n;i++){
            ans [i]=nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));

    }
}

