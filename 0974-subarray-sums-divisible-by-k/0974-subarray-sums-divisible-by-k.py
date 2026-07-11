class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        s = 0 
        res = 0
        dic = {}
        dic[0]=1
        for i in range(len(nums)):
            s+=nums[i]
            rem = s%k
            if rem<0:
                rem = rem+k
            res += dic.get(rem,0)
            dic[rem]=dic.get(rem,0)+1
        return res