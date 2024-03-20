public class Find_Minimum_roted_sorted_arr {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        int start = 0;
        int end = arr.length - 1;
        int Min = Integer.MAX_VALUE;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] >= arr[start]) {
                Min = Math.min(Min, arr[start]);
                start=mid+1;
            }else {
                Min=Math.min(Min,arr[mid]);
                end=mid;
            }
        }
        System.out.println(Min);
    }
}
