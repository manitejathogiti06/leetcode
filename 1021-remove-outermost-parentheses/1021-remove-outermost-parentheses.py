class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        stack = []
        
        depth = 0

        for i in s:
            if i =="(":
                if depth > 0:
                    stack.append(i)
                depth =depth +1
            else:
                depth= depth-1

                if depth >0:
                    stack.append(i) 

        return"".join(stack)                 