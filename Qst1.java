class MyStack{
	 // store elements of stack
	   int arr[];
	  // represent top of stack
	  int top;
	  // total capacity of the stack
	  int capacity;

	  // Creating a stack
	  MyStack(int size) {
	    // initialize the array and initialize the stack variables
	    arr = new int[size];
	    capacity = size;
	    top = -1;
	  }

	  // push elements to the top of stack
	  public void push(int x) {
	    if (isFull()) {
	      System.out.println("Stack OverFlow");

	      // terminates the program
	      System.exit(1);
	    }

	    // insert element on top of stack
	    System.out.println("Inserting " + x);
	    arr[++top] = x;
	  }

	  // pop elements from top of stack
	  public int pop() {

	    // if stack is empty and no element to pop
	    if (isEmpty()) {
	      System.out.println("STACK EMPTY");
	      // terminates the program
	      System.exit(1);
	    }

	    // pop element from top of stack
	    return arr[top--];
	  }

	  // return size of the stack
	  public int getSize() {
	    return top + 1;
	  }

	  // check if the stack is empty
	  public Boolean isEmpty() {
	    return top == -1;
	  }

	  // check if the stack is full
	  public Boolean isFull() {
	    return top == capacity - 1;
	  }

	  // display elements of stack
	  public void printStack() {
	    for (int i = 0; i <= top; i++) {
	      System.out.print(arr[i] + ", ");
	    }
	  }
}

public class Qst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stk = new MyStack(5);

	    stk.push(1);
	    stk.push(2);
	    stk.push(3);

	    System.out.print("Stack: ");
	    stk.printStack();

	    // remove element from stack
	    stk.pop();
	    System.out.println("\nAfter popping out");
	    stk.printStack();
	}

}
/*
1. Create a myStack Class which has the following methods:
1. Push(x) : inserts the data into the stack 
2. Pop(): Removes the top element.
3. Peek() : Displays the top element.
*/