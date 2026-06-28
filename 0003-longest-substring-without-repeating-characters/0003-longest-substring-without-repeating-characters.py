class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        n=len(s)
        left = 0
        dic = {}
        res=0
        for right in range(n):
            dic[s[right]] = dic.get(s[right],0)+1
            k = right-left+1

            while len(dic)<k:
                dic[s[left]]-=1
                if dic[s[left]]==0:
                    del dic[s[left]]
                left+=1
                k = right-left+1

            res=max(res, k)
        return res 