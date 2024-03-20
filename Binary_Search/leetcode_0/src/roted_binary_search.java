import java.rmi.dgc.VMID;

public class roted_binary_search {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(Rbs(nums,target));

    }

    static int Rbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > arr[start]) {   //left part was sorted;
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
        return -1;
    }

}
