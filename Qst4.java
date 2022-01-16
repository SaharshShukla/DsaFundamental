
public class Qst4 {

}
/*https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * 
 * class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cn=head;
                
         while(cn!=null&&cn.next!=null){
             
             if(cn.next.val==cn.val){
                cn.next=cn.next.next;
             }else{
              cn=cn.next;   
             }
         }
        return head;
    }
}
 */
