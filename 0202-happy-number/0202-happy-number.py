class Solution:
    def summ(self, n):
        temp_sum = 0
        while n > 0:
            d = n % 10
            n = n // 10
            temp_sum += d * d
        return temp_sum

    def isHappy(self, n: int) -> bool:
        slow = n
        fast = n

        while fast != 1:
            slow = self.summ(slow)
            fast = self.summ(fast)
            fast = self.summ(fast)

            if slow == fast and slow != 1:
                return False

        return True