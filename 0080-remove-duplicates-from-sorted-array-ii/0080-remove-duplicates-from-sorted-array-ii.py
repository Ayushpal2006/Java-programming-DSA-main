class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        read = 2
        write = 2
        k = 2
        n = len(nums)

        if n<=2:
            return k 
        
        while(n>read):
            if nums[read]==nums[write-2]:
                read = read +1
                continue
            else:
                nums[write]=nums[read]
                write = write +1
                read = read +1
                k = k+1
        return k 