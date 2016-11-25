package com.leetcode.easy;

public class MergeTwoSortedLists {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null)
			return null;
		ListNode head = new ListNode(0);
		ListNode node = head;
		while (l1 != null || l2 != null) {
			if (l1 != null && l2 != null) {
				if (l1.val < l2.val) {
					node.next = l1;
					l1 = l1.next;
				} else {
					node.next = l2;
					l2 = l2.next;
				}
				node = node.next;
			} else {
				if (l1 != null) {
					node.next = l1;
					break;
				} else {
					node.next = l2;
					break;
				}
			}
		}
		return head.next;
	}
}
