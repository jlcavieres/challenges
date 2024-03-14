package cl.challenges.exercises;



// Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

// Example 1:
// Input:
// N = 5
// A[] = {1,2,3,5}
// Output: 4


// Input:
// N = 10
// A[] = {6,1,2,8,3,4,7,10,5}
// Output: 9


public class MissingNumber {
	
	public static void main(String[] args) {
        
        int n = 10;
        int[] list = {6,1,2,8,3,4,7,10,5};
        
        System.out.println(missingNumber(list, n));
    }
    
    
    public static int missingNumber(int arr[], int n) {
        // Your Code Here       
        
        
        for (int i=1; i<=n; i++) {
            if (!lookupValue(arr, i)) 
                return i;
        }
        
        return -1;
    }
    
 
    // 1 no existe un método contains en los arreglos primitivos
    private static boolean lookupValue(int arr[], int find) {
       
    	// 2 se puede iterar directo el arreglo con un atajo (en este caso si necesitaba hacerlo por el índice)    	
    	// for (int num : arr) {
    	
    	// 3 el largo de un arreglo primitivo no es un método, es una propiedad
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == find) 
                return true;
        }
        
        return false;
        
    }

}
