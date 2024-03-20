public class roted_binary_search_2 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        boolean a=Rbs(nums,target);
        System.out.println(a);

    }

    static boolean Rbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                start+=1;
                end-=1;
                continue;
            }
            if (arr[mid] >= arr[start]) {   //left part was sorted;
                if (arr[start] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {     //right part was sorted
                if (target>arr[mid] && target<=arr[end]) {
                    start = mid +1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }

}

