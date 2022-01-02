
public class Qst3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
	int target = 6;
	int count=0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==target)
      {
          count++;
      }
    }
    if(count>0)
    {
      System.out.println("Frequency of the selected element is :"+count);
    }
    else
    {
      System.out.println("Element not present in the array");
    }

	}

}
/*qst3)Find the frequency of an element in a sorted array with
 *  duplicates present. for eg: [1,1,2,2,4,5,5,6,6,6,6,9,10,11] and target = 6 
 */	
