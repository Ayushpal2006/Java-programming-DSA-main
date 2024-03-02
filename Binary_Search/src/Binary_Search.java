public class Binary_Search {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int target=6;
        int a=Binary_search(arr,target);
        System.out.println(a);

    }

    static int Binary_search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(end>=start){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            if(target>arr[mid]) {
                start=mid+1;
            }else if (target<arr[mid]){
                end = mid -1;
            }
//            else{
//                return mid;
//            }
        }
        return -1;
    }
}
