package offer03;

/**
 * Created by Taoxiao on 2017/7/20 0020.
 * Describe:输入一个链表，从尾到头打印链表每个节点的值。
 */
import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
