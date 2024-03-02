public class linerer_search {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int element=3;
        System.out.println(search(arr,element));
    }

    static boolean search(int arr [],int element){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] ==element){
                return true;
            }
        }

        return false;
    }
}
