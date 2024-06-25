package code;

public class Merge_Two_Linked_List {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
			ListNode Dummy = new ListNode();
			ListNode temp = Dummy;
			while (list1 != null && list2 != null) {
				if (list2.val < list1.val) {
					Dummy.next = list2;
					list2 = list2.next;
					Dummy = Dummy.next;
				} else {
					Dummy.next = list1;
					list1 = list1.next;
					Dummy = Dummy.next;
				}
			}
			if (list1 == null) {
				Dummy.next = list2;
			}
			if (list2 == null) {
				Dummy.next = list1;
			}
			return temp.next;
		}
	}

}