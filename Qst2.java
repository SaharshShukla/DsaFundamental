
public class Qst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {10, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = arr.length;
      
        System.out.println("Average of array element is "+avgRec(arr,0, length));

	}
	
	 static int avgRec(int a[], int index, int len)
	    {
	        // Last element
	        if (index == len-1)
	            return a[index];
	      
	        // When index is 0, divide sum computed so
	        // faraction by length.
	        if (index == 0)
	            return ((a[index] + avgRec(a, index+1, len))/len);
	      
	        // Compute sum
	        return (a[index] + avgRec(a, index+1, len));
	    }

}

/*

2. Calculate the avg of elements of an array using recursive code.  
*/