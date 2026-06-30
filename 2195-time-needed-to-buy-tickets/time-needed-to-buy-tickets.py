class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:

        q = deque()

        for i in range(len(tickets)):
            q.append(i)


        time=0

        while q:

            person = q.popleft()

            tickets[person] = tickets[person] -1

            time = time+1


            if tickets[person] == 0:

                if person == k:
                    return time

            else:
                q.append(person)        



