class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_ending = nums[0]
        res = nums[0]
        for i in range(1,len(nums)):
            Variable_1 = max_ending + nums[i]
            Variable_2 = nums[i]
            max_ending = max(Variable_1,Variable_2)
            res = max(res,max_ending)
        return res