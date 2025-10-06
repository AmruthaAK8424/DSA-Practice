class Solution {
    public boolean arraySortedOrNot(int[] arr, int n) {
        // Iterate through each element
        for (int i = 0; i < arr.length - 1; i++) {
            
            // Compare with every subsequent element
            for (int j = i + 1; j < arr.length; j++) {
                
                // If any element is out of order, return false
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true; // All elements are in order
    }
    
    // Main method 
    public static void main(String[] args) {
        // Creating an instance of solution class
        Solution solution = new Solution();
        
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        
        // Function call to check if the array is sorted
        boolean sorted = solution.arraySortedOrNot(arr, n);
        
        if (sorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}