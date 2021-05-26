package niuke;

/**
 * 合并有序链表
 *描述
 * 将两个有序的链表合并为一个新链表，要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序。
 *
 * 示例1
 * 输入：
 * {1},{2}
 * 复制
 * 返回值：
 * {1,2}
 * 复制
 * 示例2
 * 输入：
 * {2},{1}
 * 复制
 * 返回值：
 * {1,2}
 */

public class NC33_MergeOrderList {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next = null;
    }

    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode headNode = new ListNode();
        ListNode newList = headNode;

        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                newList.next = l2;
                l2 = l2.next;
            }else{
                newList.next = l1;
                l1 = l1.next;
            }
            newList = newList.next;
        }

        newList.next = l1 == null ? l2 : l1;
        return headNode.next;
    }
}
