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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        
        ListNode temp = head;
    
        int s = size(temp);
        
        int [] arr = new int [s];
        int [] ans = new int [s];
        int k = 0;
        ListNode tmp = head;
        
        while(tmp!=null){
            
            arr[k++] = tmp.val;
            tmp = tmp.next;
        }
        
        for(int i = 0; i < s; i ++){
    
            while(!stack.isEmpty()&&arr[stack.peek()]<arr[i]){
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        
        return ans;
    }
    
    public int size (ListNode head){
        int count  = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}