class Solution:
    def maximumSum(self, arr: List[int]) -> int:
        no_delete = arr[0]      # max subarray ending here with no deletion
        one_delete = float('-inf')  # max subarray ending here with one deletion
        res = arr[0]

        for i in range(1, len(arr)):
            prev_no_delete = no_delete
            prev_one_delete = one_delete

            no_delete = max(prev_no_delete + arr[i], arr[i])
            one_delete = max(prev_one_delete + arr[i], prev_no_delete)

            res = max(res, no_delete, one_delete)

        return res