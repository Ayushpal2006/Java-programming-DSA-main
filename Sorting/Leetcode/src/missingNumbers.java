class missingNumbers {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int value = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[value]) {
                swap(nums, i, value);
            } else {
                i++;
            }
        }
        //search First Missing Number;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}

