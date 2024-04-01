public class _3_MissingNumber {
    public static void main(String[] args) {
        int []nums={9,6,4,2,3,5,7,0,1};
        int n=nums.length;
        int ans=0;
        for(int i=0;i<=n;i++){
            ans=ans^i;
        }

        for(int j=0;j<n;j++){
            ans=ans^nums[j];
        }
        System.out.println(ans);
    }
}
