public class Find_even_no_of_digits {
    public static void main(String[] args) {
        int nums[]={18,124,9,1764,98,12};

        System.out.println(Find(nums));

    }

    static int Find(int nums[]){
        int count=0;

        for(int i=0;i<nums.length;i++){
            if (even(nums[i]))
                count++;
        }
    return count;
    }

    static boolean even(int num){
        if (digit2(num)%2==0)
            return true;
    return false;
    }
    static int digit(int nums){
            int n= (int) (Math.log10(nums)+1);
            return n;
    }

    static int digit2(int nums){
        int count=0;
        while(nums>0){
            nums=nums/10;
            count++;

        }
    return count;
    }
}
