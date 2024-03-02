public class Peak_Index_852 {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {

        int start=0;
        int end=arr.length-1;

        while(end>start){
            int mid = start + (end - start) / 2;

            if(arr[mid]>arr[mid+1]){  //you are in decending part of the array
                end=mid;
            }
            else if (arr[mid]<arr[mid+1]) { //you are in asending part of the array
                start=mid+1;
            }else{
                return mid;
            }
        }
     return end;
    }
}
