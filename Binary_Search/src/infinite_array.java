public class infinite_array {
    public static void main(String[] args) {

    }

    static int ans(int arr[],int target){
    int start=0;
    int end=1;

    while(target>arr[end]){
        int newstart=end+1;
        //double the box size
        //end=end*2+1

        end=end+(end-start)*2;
        start=newstart;

    }

    return binarySearch(arr,target,start,end);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {


        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
