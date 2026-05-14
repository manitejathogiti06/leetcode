# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        # Find Middle 
        slow = head
        Fast = head
        while Fast and Fast.next:
            slow = slow.next
            Fast = Fast.next.next


        # Reverse Second Half

        prev = None

        while slow :
            next = slow.next

            slow.next = prev

            prev = slow 

            slow = next

        # compare Both

        left = head 
        right = prev

        while right:
            if left.val != right.val:
                return False

            left = left.next
            right =right.next

        return True    


                    