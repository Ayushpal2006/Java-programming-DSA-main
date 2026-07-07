class Solution:
    def remove_backspaces(self,string: str) -> str:
            stack = []
            for i in range(len(string)):
                if string[i] != '#':
                    stack.append(string[i])
                elif stack:
                    stack.pop()
            return ''.join(stack)
    def backspaceCompare(self, s: str, t: str) -> bool:
        fixed_s = self.remove_backspaces(s)
        fixed_t = self.remove_backspaces(t)
        return fixed_s == fixed_t