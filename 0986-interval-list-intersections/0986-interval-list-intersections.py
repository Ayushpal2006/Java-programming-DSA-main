class Solution:
    def intervalIntersection(self, firstList: List[List[int]], secondList: List[List[int]]) -> List[List[int]]:
        i, j = 0, 0
        res = []

        while i < len(firstList) and j < len(secondList):

            start1 = firstList[i][0]
            end1 = firstList[i][1]
            start2 = secondList[j][0]
            end2 = secondList[j][1]

            # If first interval starts before second
            if start1 <= start2:

                # Check if intervals overlap
                if end1 >= start2:
                    s = max(start1, start2)
                    e = min(end1, end2)
                    res.append([s, e])

            # If second interval starts before first
            else:

                # Check if intervals overlap
                if end2 >= start1:
                    s = max(start1, start2)
                    e = min(end1, end2)
                    res.append([s, e])

            # Move the pointer of the interval that ends first
            if end1 <= end2:
                i += 1
            else:
                j += 1

        return res