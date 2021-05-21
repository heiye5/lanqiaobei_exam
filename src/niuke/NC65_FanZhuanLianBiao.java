package niuke;


/**
 * 标题：反转链表
 * 题目描述
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 示例1
 * 输入
 * 复制
 * {1,2,3}
 * 返回值
 * 复制
 * {3,2,1}
 */

public class NC65_FanZhuanLianBiao {
    public static void main(String[] args) {

    }

    //定义链表类
    public class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    //反转链表
    public ListNode ReverseList(ListNode head) {
        //链表为空直接返回
        if(head == null){
            return head;
        }

        ListNode pre = null;            //pre指向最后一个节点
        ListNode cur = head;            //cur指针指向待反转链表的第一个节点
        ListNode nex = head.next;
        //循环执行以下三个操作
        while(cur != null){
            nex = cur.next;             //保存作用
            cur.next = pre;             //未反转链表的第一个节点的下个指针指向已反转链表的最后一个节点
            pre = cur;                  // 指针后移，操作下一个未反转链表的第一个节点
            cur = nex;
        }

        return pre;
    }

    public ListNode ReverseList2(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode r=cur.next;
            cur.next=pre;
            pre=cur;
            cur=r;
        }
        return pre;
    }
}
