class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        max_ending = nums[0]
        min_ending = nums[0]
        res = nums[0]
        for i in range(1,len(nums)):
            Variable_1 = max_ending * nums[i]
            Variable_2 = nums[i]
            Variable_3 = min_ending * nums[i]
            max_ending = max(Variable_1,max(Variable_2,Variable_3))
            min_ending = min(Variable_1,min(Variable_2,Variable_3))
            res = max(res,max(max_ending,min_ending))
        return res