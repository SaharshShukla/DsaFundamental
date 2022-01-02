
public class Qst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]num= {-1,0,3,5,9,12};
		int start=0;
		int target=2;
		int end=num.length-1;
		 
		 while(start<=end) {
			 int mid=start+(end-start)/2;
			 
			 
			 if(target==num[mid]){
				 System.out.println("index is "+mid);
				 break;
			 }
			 else if(target<num[mid]){
				 end=mid-1;//we will se left side of an array
				 
				 if(target!=num[mid]) {//to check if element is not found
					 System.out.println(" target not found  so -1 is return");
				 }
			 }
			 else {//we will se right side of an array
				 start=mid+1;
			 } 
		 }
	
		 
	}
}
	


/*
qts1)Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums. If target exists, then return its index. 
Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1

*/

