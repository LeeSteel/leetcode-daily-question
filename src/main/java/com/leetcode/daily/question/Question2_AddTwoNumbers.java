package com.leetcode.daily.question;

import com.leetcode.daily.question.bean.question2.ListNode;
import com.leetcode.daily.tags.difficulty.Medium;
import org.junit.jupiter.api.Test;

/**
 * @version V1.0
 * @Title:
 * @Package
 * @Description: 两数相加
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author: 李钢 2580704698@qq.com
 * @date: 2020/8/13 17:03
 * @Copyright: Copyright (c) 2019
 */
public class Question2_AddTwoNumbers  implements Medium {

    /**
     *
     */
    @Test
    public  void addTwoNumbers1Test( ) {
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(2);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode11 = new ListNode(4);
        ListNode listNode12 = new ListNode(5);
        ListNode listNode13 = new ListNode(6);

        listNode11.next = listNode12;
        listNode12.next = listNode13;



        addTwoNumbers1(listNode1, listNode11);

    }


    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null){ p = p.next;}
            if (q != null){ q = q.next;}
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;

    }
}


