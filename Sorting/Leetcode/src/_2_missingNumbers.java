public class _2_missingNumbers {
    public static void main(String[] args) {
        int []nums={9,6,4,2,3,5,7,0,1};
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int acutualSum=0;
        for (int num : nums) {
            acutualSum = num + acutualSum;
        }
        System.out.println(expectedSum-acutualSum);
    }
}
