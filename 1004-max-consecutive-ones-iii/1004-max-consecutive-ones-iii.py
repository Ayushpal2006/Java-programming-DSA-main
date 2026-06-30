class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        low = 0
        n = len(nums)
        res = -1
        zeros = 0
        
        for high in range(n):
            if nums[high]==0:
                zeros+=1
            while zeros>k:
                if nums[low]==0:
                    zeros-=1
                low = low + 1
                
            res = max(res, high - low + 1)
        
        return res