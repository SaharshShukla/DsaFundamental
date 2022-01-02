
public class Qst3 {

	 public static int power(int base, int powerRaised) {
		    if (powerRaised != 0) {

		      // recursive call to power()
		      return (base * power(base, powerRaised - 1));
		    }
		    else {
		      return 1;
		    }
		  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 2, powerRaised = 5;
	    int result = power(base, powerRaised);

	    System.out.println(base + "^" + powerRaised + "=" + result);

	}

}

/*
 * 3. Write a recursive code to find the x^y . example: 2^5 = 32. 
 * 
 */