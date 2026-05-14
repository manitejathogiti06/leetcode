# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        slow = head
        Fast = head

        while Fast and Fast.next:
            slow = slow.next
            Fast= Fast.next.next


            if slow == Fast :
                return True

        return False        

