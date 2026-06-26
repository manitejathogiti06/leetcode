class Solution:
    def finalPrices(self, prices: List[int]) -> List[int]:
        
        n= len(prices)

        ans = prices[:]

        stack =[]

        for i in range(n):

            while stack and prices[i] <= prices[stack[-1]]:
                
                idx = stack.pop()

                ans[idx] = prices[idx] -prices[i]

            stack.append(i)   

        return ans     