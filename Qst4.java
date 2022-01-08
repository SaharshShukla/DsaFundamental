import java.util.Random;

public class Qst4 {
	static void shuffleArray(int[] array) {
        Random rndmVar = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rndmVar.nextInt(i + 1);
            // Simple swap
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }

    static int partition(int array[], int start, int end) {
        int i = start - 1;
        int j = start;
        int pivot = array[end]; 

        for (; j < end; j++) {
            if (array[j] < pivot) {
                ++i;
                
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        int tmp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = tmp;
        return i + 1;
    }

    static void quicksort(int arr[], int s, int e) {
        if (s >= e)
            return;
        int pivot_idx = partition(arr, s, e);
        quicksort(arr, s, pivot_idx - 1);
        quicksort(arr, pivot_idx + 1, e);

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 10, -1, -9, 2, 4, 5, 6, 8, 10, 11, 15 };
        shuffleArray(array);
        quicksort(array, 0, array.length - 1);

      
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
	}

}

/*4. Write a randomized quick sort, to sort the input arrays in descending order.
*/