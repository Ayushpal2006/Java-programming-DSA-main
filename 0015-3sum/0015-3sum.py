class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        res = []

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            l = i + 1
            j = len(nums) - 1
            target = -nums[i]

            while l < j:
                temp = nums[l] + nums[j]

                if temp == target:
                    res.append([nums[i], nums[l], nums[j]])

                    l += 1
                    j -= 1
                    # duplicate find karne me help karega 
                    while l < j and nums[l] == nums[l - 1]:
                        l += 1

                    while l < j and nums[j] == nums[j + 1]:
                        j -= 1

                elif temp < target:
                    l += 1
                else:
                    j -= 1

        return res
        