
public class Qst5 {

	static boolean palin(String st,int e,int s) {
		
		if(s>=e) {
			return(true);
		}
		
		if(st.charAt(s)!=st.charAt(e)) {
			return (false);
		}else {
			return (palin(st,e-1,s+1));
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="NITIN";
        int end=str.length()-1;
        int start=0;
        
       if( palin(str,end,start)) {
    	   System.out.println("String is palindrome");
       }else {
    	   System.out.println("String is  not palindrome");
       }
        
	}

}
/*
5.Write a recursive code to check if a string is a palindrome or not. 
[Hint: reverse the string and send both strings into the function and check.]"
*/