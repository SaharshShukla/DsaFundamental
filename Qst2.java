import java.util.Scanner;
public class Qst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter number for square root: ");
int n=sc.nextInt();
		int start=0;
		int end=n;
		while(start+1<end) {
			int mid=start+(end-start)/2;
			
			if(mid*mid==n){//if num lie b/w o to mid square
				System.out.println("Square root of number is "+mid);
				break;
			}else if(mid*mid<n){
				start=mid;
			}else {
				end=mid;
				
			}
			if(end*end==n){//if number is at end
				System.out.println("Square root of number is "+end);
			}else {//if number is at start
				System.out.println("Square root of number is "+start);
			}
		}
		
		
			
			}

		}
		/*
		qst2)Given a non-negative integer x, compute and return the square root of x.

		Since the return type is an integer, the decimal digits are truncated, 
		and only the integer part of the result is returned.

		Note: You are not allowed to use any built-in exponent 
		function or operator, such as pow(x, 0.5) or x ** 0.5.

		 

		Example 1:

		Input: x = 4
		Output: 2
		*/
