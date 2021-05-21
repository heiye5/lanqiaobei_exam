package niuke;

/**
 *  题目描述
 * 判断给定的链表中是否有环。如果有环则返回true，否则返回false。
 * 你能给出空间复杂度的解法么？
 */

public class PanDuanLianBiao {
    class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    /*
    慢指针针每次走一步，快指针每次走两步，
    如果相遇就说明有环，如果有一个为空说明没有环
     */
    public boolean hasCycle(ListNode head) {
        //为空直接返回
        if(head == null){
            return false;
        }

        ListNode fast = head;       //定义快指针
        ListNode slow = head;       //定义慢指针
        while(fast != null && fast.next != null){       //优先判断快指针
            slow = slow.next;       //慢指针每次走一步
            fast = fast.next.next;  //快指针每次走两步
            if(slow == fast){       //相遇说明有环
                return true;
            }
        }

        return false;
    }
}
