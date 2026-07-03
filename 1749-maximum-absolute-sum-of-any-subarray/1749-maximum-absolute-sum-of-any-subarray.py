class Solution:
    def maxAbsoluteSum(self, nums: List[int]) -> int:
        min_ending = nums[0]
        max_ending = nums[0]
        res = nums[0]
        for i in range(1,len(nums)):
            Variable_1 = min_ending + nums[i]
            Variable_2 = nums[i]
            Variable_3 = max_ending + nums[i]
            min_ending = min(Variable_1,min(Variable_2,Variable_3))
            max_ending = max(Variable_1,max(Variable_2,Variable_3))
            res = max(res,max(abs(min_ending),abs(max_ending)))
        return abs(res)