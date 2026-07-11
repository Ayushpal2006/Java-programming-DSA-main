class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        summ = 0
        res = 0
        hash_map = {}
        hash_map[0]=1
        for i in range(len(nums)):
            summ+=nums[i]
            ques = summ-k
            freq= hash_map.get(ques, 0)
            res+=freq
            hash_map[summ]=hash_map.get(summ,0)+1
        return res