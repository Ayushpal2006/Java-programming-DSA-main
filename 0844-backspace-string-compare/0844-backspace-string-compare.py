class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        # Start from the end of both strings
        i = len(s) - 1
        j = len(t) - 1

        # Process until both strings are exhausted
        while i >= 0 or j >= 0:

            # -------------------------
            # Find next valid character in s
            # -------------------------
            skip_s = 0

            while i >= 0:
                if s[i] == "#":
                    # '#' means one previous character should be ignored
                    skip_s += 1
                    i -= 1

                elif skip_s > 0:
                    # Skip this character because of a previous '#'
                    skip_s -= 1
                    i -= 1

                else:
                    # Found the next valid character
                    break

            # -------------------------
            # Find next valid character in t
            # -------------------------
            skip_t = 0

            while j >= 0:
                if t[j] == "#":
                    skip_t += 1
                    j -= 1

                elif skip_t > 0:
                    skip_t -= 1
                    j -= 1

                else:
                    break

            # Both pointers are on valid characters
            # If they are different, strings can't be equal
            if i >= 0 and j >= 0 and s[i] != t[j]:
                return False

            # One string has a valid character left,
            # but the other one doesn't
            if (i >= 0) != (j >= 0):
                return False

            # Compare next pair of valid characters
            i -= 1
            j -= 1

        return True