class Solution:
    def findUnsortedSubarray(self, nums: List[int]) -> int:
        n = len(nums)

        # Left se pehla index dhoondo jahan sorting break ho rahi ho
        left = -1
        for i in range(n - 1):
            if nums[i] > nums[i + 1]:
                left = i
                break

        # Agar kahin bhi sorting break nahi hui, array pehle se sorted hai
        if left == -1:
            return 0

        # Right se pehla index dhoondo jahan sorting break ho rahi ho
        right = -1
        for i in range(n - 1, 0, -1):
            if nums[i] < nums[i - 1]:
                right = i
                break

        # Unsorted subarray ka minimum aur maximum nikaalo
        sub_min = min(nums[left:right + 1])
        sub_max = max(nums[left:right + 1])

        # Agar left ke pehle koi element sub_min se bada hai,
        # to usse bhi unsorted subarray me include karo
        while left > 0 and nums[left - 1] > sub_min:
            left -= 1

        # Agar right ke baad koi element sub_max se chhota hai,
        # to usse bhi unsorted subarray me include karo
        while right < n - 1 and nums[right + 1] < sub_max:
            right += 1

        # Final unsorted subarray ki length return karo
        return right - left + 1