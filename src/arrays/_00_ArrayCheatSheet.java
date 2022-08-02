package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] practice = {"Bob","Joe","Ted","Fred","Dave"};
		//2. print the third element in the array
		System.out.println(practice[2]);
		//3. set the third element to a different value
		practice[2] = "Daniel";
		//4. print the third element again
		System.out.println(practice[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i =0; i<practice.length;i++) {
			System.out.println(i);
		}
		
		//6. make an array of 50 integers
		int []a = new int[50];
		Random ran = new Random();
		int lowRange = 0;
		int highRange = 0;
		for(int i =0; 50 > i; i++) {
			a[i] = ran.nextInt();
		}
		for(int b = 0; 50 > b; b++) {
			if(a[b] > highRange) {
				highRange = a[b];
				
				
			}
			if(a[b] < lowRange) {
				lowRange = a[b];
			}
		}
		
		
		
		
		System.out.println(lowRange);	
		System.out.println(highRange);
		System.out.println(Arrays.toString(a));
		}
		
		
		
		//7. use a for loop to make every value of the integer array a random number
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}


