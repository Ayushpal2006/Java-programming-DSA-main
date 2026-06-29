class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        low = 0
        window = 0
        n = len(nums)
        res = -1
        
        # 1111 4
        
        for high in range(n):
            window = window + nums[high]
            
            while window + k < high - low + 1:
                window = window - nums[low]
                low = low + 1
                
            res = max(res, high - low + 1)
        
        return res