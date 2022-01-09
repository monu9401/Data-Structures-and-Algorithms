/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ArrayList<Integer> al;
    public Solution(ListNode head) {
        al=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            al.add(temp.val);
            temp=temp.next;
        }
    }
    
    public int getRandom() {
        int x = (int)(Math.random()*al.size());
        return al.get(x);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */