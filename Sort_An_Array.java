
public class Sort_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int[]arr= {5,2,3,1};

		for (int i = 0; i < arr.length; i++)   
		        {  
		            for (int j = i + 1; j < arr.length; j++)   
		            {  
		                int temp = 0;  
		                if (arr[i] > arr[j])   
		                {  
		                	temp = arr[i];  
		                    arr[i] = arr[j];  
		                    arr[j] = temp;  
		                }  
		            }   System.out.println(arr[i]);
		        }
	}

}
/*
Given an array of integers nums, sort the array in ascending order.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
*/
