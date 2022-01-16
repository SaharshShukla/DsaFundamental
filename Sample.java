import java.util.*;
public class Sample {
    public static void main(String[] args){
    	LinkedList<Integer>l=new LinkedList<>();
    	l.add(1);
    	l.add(2);
    	l.add(3);
    	l.add(4);
    	l.add(5);
    	l.add(6);
    	l.add(7);
    	
    	//4. Printing the whole list from beginning .
//    	System.out.println("Printing the whole list from beginning  ");
//    	for(int i=0;i<l.size();i++){
//    		System.out.print(l.get(i)+" ");}
    	
    	//2. Deletion at any given position , provided it's index value.
//    	System.out.println("Deletion at any given position , provided it's index value.");
//    			l.remove(4);//removing elemnt present at index 4 bcoz staring is from 0
//    			System.out.println("Printing the whole list from beginning once again ");
//    	    	for(int i=0;i<l.size();i++){
//    	    		System.out.print(l.get(i)+" ");}
    			
    	//1. Insertion at any given position , provided it's index value.
//    	System.out.println("\nInsertion at any given position , provided it's index value.");
//		l.add(4, 15);//Inserting 15 at index 4
//		System.out.println("Index is "+l.indexOf(l.get(4))+" and  Element is "+l.get(4));
		
    	//3. Searching a given element and returning it's index 
    	//value if the element is found or else return -1.
       
//        for(int i=0;i<l.size();i++){
//        	if(l.contains(1)){
//        		System.out.println("Element found and index is "+l.indexOf(i));
//        	}else {
//        		System.out.println("Element not found ");
//        	}
//        }
    	
    	
    	//Printing the list starting from a given index, for example : 
        //1->2->3->4->5->6->7->null for this 
       // given linkedlist print(3) means print only 4,5,6,7 on screen."
    	for(int i=3;i<l.size();i++){
    		System.out.print(l.get(i)+" ");
    		
    	}
        
        
        
    }
}
/*10/01/2022
Linked List 
"Implement a singly linked list from scratch with following operation:
1. Insertion at any given position , provided it's index value.//done
2. Deletion at any given position , provided it's index value.//done
3. Searching a given element and returning it's index //done
value if the element is found or else return -1.
4. Printing the whole list from beginning .//done
5. Printing the list starting from a given index, for example : 
    1->2->3->4->5->6->7->null for this 
    given linkedlist print(3) means print only 4,5,6,7 on screen."*/