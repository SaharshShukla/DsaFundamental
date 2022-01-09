import java.util.*;
public class Qst2 {
	
	static boolean valid(String s) {
		
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') stack.push(a);
            else if(stack.empty()) return false;
            else if(a == ')' && stack.pop() != '(') return false;
            else if(a == ']' && stack.pop() != '[') return false;
            else if(a == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "()(())){{}}[{}]";
        System.out.println("Is parenthess valid: "+valid(s));
	}

}
/*
2. https://leetcode.com/problems/valid-parentheses/
*/