//no output
public class Qst3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	displayEvenNumbers(76);   
	  
		
		
	}
	
	private static void displayEvenNumbers(int number){   
		
	if(number>=2)   
	return;   
	if(number%2==0){   
		
	//prints the even numbers  
	System.out.print(number +" "); 
	
	//calling the method and decrement the number by 2 if the number is even  
	displayEvenNumbers(number -2);   
	System.out.print(number);
	}else{   
	//decrement the number by 1 if the number is odd  
	displayEvenNumbers(number-1);
	System.out.print(number);
	}   
	}  
	
	}  




/*
3.Write a head recursion code to print 
only EVEN elements in decreasing order starting from user-defined input N.
example: N = 76 
               Output: 76,74,72,70,68,66......2
*/