public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 9, 10};
        int target = 7;
        System.out.println(search(arr,target,0,arr.length));

    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (target==arr[m]){
            return m;
        }
        if (target>arr[m]){
            return search(arr,target,s=m+1,e);
        }
        return search(arr,target,s,e=m-1);
    }
}
