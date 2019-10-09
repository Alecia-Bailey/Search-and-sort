package search;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int arr[] = new int [5];
		int arrSize = 5, option;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter 5 numbers: ");
		for (int i=0;i<arrSize;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Array elements are: ");	
		System.out.println(Arrays.toString(arr));
		input.close();
		
		System.out.println("Which operation would you like to perform on the array?");
		System.out.println("1. Linear Search, 2. Binary Search, 3. Bubble Sort, 4. Selection Sort, 5. Insertion Sort");
	    option= input.nextInt();
	    
	    while(option != 0) {
	    	if(option <0 || option >4)
	          {
	              System.out.println("Wrong input");
	            }
	             
	          if(option >=1 && option <=4)
	          {
	        	  switch (option) {
	        	  	case 1: 
	        	  		linearSearch();
	        	  	case 2:
	        	  		binarySearch();
	        	  	case 3:
	        	  		bubbleSort();
	        	  	case 4:
	        	  		selectionSort();
	        	  	case 5:
	        	  		insertionSort();
	      	      }// End switch
	         } //End if
	    }// End while
		
}
