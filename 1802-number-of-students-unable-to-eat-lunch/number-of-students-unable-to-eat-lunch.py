class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        

        q = deque(students)

        i = 0

        r =0


        while q and r < len(q):

            if q[0] ==  sandwiches[i]:

                q.popleft()
                i= i+1
                r =0

            else:

                q.append(q.popleft())    

                r= r+1

        return len(q)        