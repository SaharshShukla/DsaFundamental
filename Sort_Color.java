
public class Sort_Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [] num = {2,0,2,1,1,0};

	      int leng=num.length;
	      
	        for (int i = 1; i < leng; i++){  
	            int j = i;  
	            int a = num[i]; 
	            
	            while ((j > 0) && (num[j-1] > a)){
	                num[j] = num[j-1];  
	                j--;  
	            }
	            
	            num[j] = a;       
	        } 
	        
	        for(int i=0;i<num.length;i++){
	        System.out.print(num[i]+" ");
	        }
	}

}

/*
 * Given an array nums with n objects colored red, 
 * white, or blue, sort them in-place so that
 *  objects of the same color are adjacent, with the 
 *  colors in the order red, white, and blue.
We will use the integers 0, 1,
 and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 */
