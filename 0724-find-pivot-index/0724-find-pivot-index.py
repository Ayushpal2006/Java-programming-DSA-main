class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        left = 0
        summ = sum(nums) 
        for i in range(len(nums)):
            
            right = summ-left-nums[i]
            if right==left:
                return i
            
            left = left + nums[i]

        return -1