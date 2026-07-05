class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        officer=0
        cm=1
        k=1
        n=len(nums)
        while n>cm:
            if nums[cm]==nums[cm-1]:
                cm=cm+1
                continue
            nums[officer+1]=nums[cm]
            officer=officer+1
            k=k+1
            cm=cm+1
        return k