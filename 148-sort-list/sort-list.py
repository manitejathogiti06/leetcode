# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        empty_node = []

        curr = head
        
        while curr:
            empty_node.append(curr.val)
            curr= curr.next


        empty_node.sort()

        dummy_node = ListNode(0)

        temp = dummy_node

        for i in empty_node:
            temp.next = ListNode(i)
            temp =temp.next

        return dummy_node.next


