
public class Qst1 {

	public static int Maxi(int a[], int n)
    {
      if(n == 1)
        return a[0];
         
        return Math.max(a[n-1], Maxi(a, n-1));//math function to calutale maximum
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 int[] arr ={1,-1,0,2,-2,3,-3,4,-4};
	 int n = arr.length;
     System.out.println("Maximum element is "+Maxi(arr, n));
     System.out.println("Minimum element is "+Mini(arr, n));

	}
	
	public static int Mini(int a[], int n)
    {
      if(n == 1)
        return a[0];
         
        return Math.min(a[n-1], Mini(a, n-1));//math function to calutale minimum
    }

}
/*
"1.Write a recursive code for finding the max 
and min element in the given array arr ={1,-1,0,2,-2,3,-3,4,-4}
        NOTE: pass arr in every function call.


     


*/