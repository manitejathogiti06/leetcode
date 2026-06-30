class Solution:
    def deckRevealedIncreasing(self, deck: List[int]) -> List[int]:

        deck.sort()

        n = len(deck)

        ans = [0]*n

        q = deque(range(n))

        for card in deck:

            index = q.popleft()

            ans[index] = card


            if q:

                q.append(q.popleft())



        return ans        




       