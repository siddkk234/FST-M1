package Activity;

import java.util.Arrays;

public class Activity4 {
	
	static void ascendingSort( int Array[]) {
		int size= Array.length;
		
		for(int i=1; i<size; i++)
		{
			 int key = Array[i];
	            int j = i - 1;
	            
	            while (j >= 0 && key < Array[j]) {
	                Array[j + 1] = Array[j];
	                --j;
	            }
	            Array[j + 1] = key;
	        
		}
		
	}

	public static void main(String[] args) {
		int array[]= {5,2,8,3,4,6,9};
		ascendingSort(array);
		System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(array));
		

	}

}
