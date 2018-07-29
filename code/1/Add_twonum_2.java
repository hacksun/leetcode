class ListNode{
	int val;
	ListNode next;
	ListNode(int x){val = x;}
	public String toString(){
		return val+"";
	}
}

class Solution{
	public ListNode addTwoNumbers(ListNode l1;ListNode l2){
		if(l1==null&&l2=null)
			return null;
		if(l1==null&&l2!=null)
			return l2;
		if(l1!=null&&l2==null)
			return l1;
		
		int tmp;
		ListNode root = new ListNode(0);
		root.next = l2;
		while(l1!=null&&l2!=null){//l1 and l2 both unempty.
			tmp = l1.val+l2.val;//the first number of the linked lists are ex.
			if(tmp>=10&&l1.next!=null){
				tmp=tmp-10;
				++l1.next.val;
				if(l1.next.val>=10&&l1.next.next!=null){
					l1.next.val=l1.next.val-10;
					++l1.next.next.val;
				}
				else if(l1.next.val>=10&&l1.next.next==null){
					l1.next.val=l1.next.val-10;
					l1.next.next=new ListNode(1);
				}
			}
			l2.val=tmp;
			if(l2.next==null){
				l2.next=l1.next;
				l1=l1.next;
				break;
			}else{
				l1=l1.next;
				l2=l2.next;
			}
		}
		return root.next;
	}
}
public class Add_twonum_2{
	public static void main(String[] args){
		ListNode list11 = new ListNode(8);
		ListNode listl2 = new ListNode(9);
		ListNode listl3 = new ListNode(9);
		
		ListNode list21 = new ListNode(2);
		
		list11.next=list12;
		list12.next=list13;
		list13.next=null;
		list21.next=null;
		
		Solution ex = new Solution();
		ListNode result = ex.addTwoNumbers(listl1;listl21);
		
		while(result!=null){
			System.out,print(result+"->");
			result = result.next;
		}
	}
}