class Solution:
    def sahi_hai(self,have : list,needed : list) -> bool:
        for i in range(256):
            if needed[i]>have[i]:
                return False
        return True
    def minWindow(self, s: str, t: str) -> str:
        m = len(s)
        n = len(t)
        have = [0]*256
        needed = [0]*256
        if n>m:
            return ""
        for i in t:
            needed[ord(i)]+=1
        
        low = 0
        start =-1
        res = float('inf')

        for high in range(m):
            have[ord(s[high])]+=1

            while (self.sahi_hai(have,needed)):
                length = high-low+1
                if res>length:
                    res = length
                    start = low
                have[ord(s[low])]-=1
                low+=1
        if res==float('inf'):
            return ""
        else:
            return s[start:start+res]