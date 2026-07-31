class Solution:
    def intervalIntersection(self, firstList: List[List[int]], secondList: List[List[int]]) -> List[List[int]]:
        i, j = 0, 0
        res = []

        while i < len(firstList) and j < len(secondList):

            start1, end1 = firstList[i]
            start2, end2 = secondList[j]

            # Check if current intervals overlap
            if max(start1, start2) <= min(end1, end2):
                res.append([max(start1, start2), min(end1, end2)])

            # Move the pointer of the interval that ends first
            if end1 <= end2:
                i += 1
            else:
                j += 1

        return res