package cl.challenges.exercises;

public class NumberJumps {
	
	
	
	// Given an array of N integers arr[] where each element represents the maximum length of the jump that can be made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
	// Find the minimum number of jumps to reach the end of the array (starting from the first element). If an element is 0, then you cannot move through that element.

	// Note: Return -1 if you can't reach the end of the array.
	
	//	Input:
	//	N = 11 
	//	arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
	//	Output: 3 
	//	Explanation: 
	//	First jump from 1st element to 2nd 
	//	element with value 3. Now, from here 
	//	we jump to 5th element with value 9, 
	//	and from here we will jump to the last. 
		
		
	//	Input :
	//	N = 6
	//	arr = {1, 4, 3, 2, 6, 7}
	//	Output: 2 
	//	Explanation: 
	//	First we jump from the 1st to 2nd element 
	//	and then jump to the last element.
	

	public static void main(String[] args) {

		// int[] arr = { 1, 4, 3, 2, 6, 7 };		
		int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; 

		System.out.println("Jumps needed: " + minJumps(arr));
	}
	

	static int minJumps(int[] arr) { 

		int value = 0;
		int currentAvailablesToMove = 0;
		int qJumps = 0;

		int i = 0;

		do {
			value = arr[i];

			currentAvailablesToMove = (arr.length - i) - 1;

			System.out.println("For current index " + i + " with value " + arr[i] + " there are "+ currentAvailablesToMove + " available to move ");

			// No es una buena práctica hacer esto dentro de un for
			i = i + value; // jump the number of position that the value says

			// System.out.println("Debe saltar al índice " + i + " with value " + arr[i]);
			// System.out.println("Debe saltar al índice "+ i + " with value: "+ );
			System.out.println("");

			qJumps++;
			

		} while (value < currentAvailablesToMove);

		return qJumps;
	}

}
