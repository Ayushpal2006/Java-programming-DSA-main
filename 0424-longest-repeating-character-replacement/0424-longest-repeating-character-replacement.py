class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        low = 0
        lst = [0] * 256
        n = len(s)
        res = -1
        for high in range(n):
            lst[ord(s[high])]+=1
            size = high-low+1
            max_val = max(lst[:256])
            diff = size-max_val

            while diff>k:
                lst[ord(s[low])]-=1
                low+=1
                size = high-low+1
                max_val = max(lst[:256])
                diff = size-max_val

            size = high-low+1
            max_val = max(lst[:256])
            diff = size-max_val
            res=max(res,size)
        return res
