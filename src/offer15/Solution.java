package offer15;

/**
 * Created by Taoxiao on 2017/7/28 0028.
 * Describe:输入一个链表，反转链表后，输出链表的所有元素。
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}