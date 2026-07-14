class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        zero = 0
        one = 0
        res = 0
        hash_map = {}

        for i in range(len(nums)):
            if nums[i] == 0:
                zero += 1
            else:
                one += 1

            diff = zero - one

            if diff == 0:
                res = max(res, i + 1)
            elif diff not in hash_map:
                hash_map[diff] = i
            else:
                res = max(res, i - hash_map[diff])

        return res