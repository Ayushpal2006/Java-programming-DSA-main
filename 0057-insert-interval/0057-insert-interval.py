class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        res = []
        inserted = False
        for i in range(len(intervals)):
            start = intervals[i][0]
            if inserted==False and start>=newInterval[0]:
                res.append(newInterval)
                inserted = True
            res.append(intervals[i])
        if inserted==False:
            res.append(newInterval)

        result = []
        res.sort()

        start1 = res[0][0]
        end1 = res[0][1]

        for i in range(1, len(res)):
            start2 = res[i][0]
            end2 = res[i][1]

            if end1 >= start2:
                end1 = max(end1, end2)
                continue

            result.append([start1, end1])
            start1 = start2
            end1 = end2

        result.append([start1, end1])
        return result

