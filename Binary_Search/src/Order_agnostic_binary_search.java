public class Order_agnostic_binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] prr={9,8,5,1};
        int target = 8;
        int a = oabs(arr, target);
        System.out.println(a);

    }

    static int oabs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean Acending;
        if(arr[start]<arr[end])
            Acending=true;
        else
            Acending=false;
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target)
                return mid;
            if(Acending)
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            else
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }

        }
    return -1;
    }
}
