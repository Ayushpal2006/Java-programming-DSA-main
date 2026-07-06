class Solution:
    def countTriplets(self, target, arr):
    
        arr.sort()
        count = 0

        for i in range(len(arr) - 2):
            left = i + 1
            right = len(arr) - 1

            while left < right:
                current_sum = arr[i] + arr[left] + arr[right]

                if current_sum < target:
                # left ke saath right tak ke sab elements valid hain
                    count += (right - left)
                    left += 1
                else:
                    right -= 1

        return count
                