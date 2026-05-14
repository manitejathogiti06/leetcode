# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
    

        empty_list = []

        curr = head

        while curr:
            empty_list.append(curr.val)
            curr = curr.next

        pal_list = empty_list[::-1]

        return empty_list == pal_list