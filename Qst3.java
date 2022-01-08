import java.util.Stack;

public class Qst3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="1+1";
		 int sum=0;
		 int sign=1;//to sign is positive
		 
		 Stack<Integer> st=new Stack<>();
		 
		 for(int i=0;i<str.length();i++){
			 char ch=str.charAt(i);
			 
			 if(Character.isDigit(ch)){
				 int val=0;
				 
				 while(i<str.length()&&Character.isDigit(str.charAt(i))){
					 val=val*10+(str.charAt(i)-'0');
					 i++;
				 }
				 i--;//to get i value agian after increment 
				 val=val*sign;
				 sign=1;//reseting sign to plus
				 sum+=val;			 
			 }else if(ch=='('){//if string has open braces
				 st.push(sum);
				 st.push(sign);
				 sum=0;
				 sign=+1;
			 }else if(ch==')'){
				 sum*=st.pop();
				 sum+=st.pop();
			 }else if(ch=='-'){
				 sign*=-1;
			 }
		 }
		 System.out.print("Sum is "+sum);
	}

}

/*
 * Given a string s representing a valid 
 * expression, implement a basic calculator to evaluate it, 
 * and return the result of the evaluation.

Note: You are not allowed to use any built-in 
function which evaluates strings as mathematical expressions, such as eval().
Example 1:

Input: s = "1 + 1"
Output: 2
Example 2:

Input: s = " 2-1 + 2 "
Output: 3
Example 3:

Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23
*/
