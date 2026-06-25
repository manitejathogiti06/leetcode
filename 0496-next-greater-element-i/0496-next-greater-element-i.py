class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:

        stack = []

        mp = {}

        for i in nums2:

            while stack and stack[-1] < i :

                mp[stack.pop()] = i


            stack.append(i)

        while stack :

                mp[stack.pop()] = -1



        return [mp[i] for i in nums1]            
                  
        