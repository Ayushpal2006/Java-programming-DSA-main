class Solution:
    def reverse(self, s: str) -> str:
        stack = []
        reverse = ""

        for char in s:        # "inn" nahi, "in"
            stack.append(char)  # s.push nahi; stack.append use hoga

        while len(stack) > 0:   # s ki jagah stack check karo
            reverse = reverse + stack.pop()

        return reverse