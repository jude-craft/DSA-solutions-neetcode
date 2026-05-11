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
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;

        // Push all nodes int a stack
        while(temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        
        // Make the last node as new head in the linked list
        if (!stack.isEmpty()){
           head = stack.pop();
           temp = head;

           // pop all nodes and append into the linked list
           while(!stack.isEmpty()){
            temp.next = stack.pop();
            temp = temp.next;
           }

           // update the last pointer of the node to null
           temp.next = null;
        }
    
        return head;
    }

    static void printList(ListNode node){
        while(node != null){
            System.out.print(node.val);
        
            if(node.next !=null)
               System.out.print("<->");
            node = node.next;
        }
        System.out.println();
    }
}
