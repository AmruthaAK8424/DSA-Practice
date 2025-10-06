import java.util.*;

class Solution {
    public void reverse(int arr[], int n) {
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = arr[i];
        }

        // Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

public class reversearray {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("The elements reversed:");
        Solution sc = new Solution();
        sc.reverse(arr, n);
    }
}
