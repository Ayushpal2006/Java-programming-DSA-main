class Solution:
    def smallestSumSubarray(self, nums, N):
        min_ending = nums[0]
        res = nums[0]
        for i in range(1,len(nums)):
            Variable_1 = min_ending + nums[i]
            Variable_2 = nums[i]
            min_ending = min(Variable_1,Variable_2)
            res = min(res,min_ending)
        return res
        