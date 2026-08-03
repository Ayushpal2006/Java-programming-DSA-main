class Solution:
    def minMeetingRooms(self, start, end):
        start.sort()
        end.sort()
        res = 0
        room =0
        i,j=0,0
        n=len(start)
        while(i<n and j<n):
            if(start[i]<end[j]):
                room = room+1
                i=i+1
                res = max(res,room)
            else:
                room = room-1
                j=j+1
        return res
