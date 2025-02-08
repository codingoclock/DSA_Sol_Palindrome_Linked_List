
class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode reverse (ListNode head)
    {
        ListNode prev = null;
        while(head != null)
        {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversedhalf = reverse(slow);

        ListNode firsthalf = head;
        while(reversedhalf != null)
        {
            if(firsthalf.val != reversedhalf.val)
            {
                return false;
            }
            firsthalf = firsthalf.next;
            reversedhalf = reversedhalf.next;
        }
        return true;
    }
}
