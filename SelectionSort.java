import java.util.*;

public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        // write code here
        for (int i = 0; i < n - 1; ++i){
            int k = i;
            for (int j = i + 1; j < n; ++j){
                if(A[k] > A[j]){
                    k = j;
                }
            }
            if(i != k){
                int t = A[i];
                A[i] = A[k];
                A[k] = t;
            }
        }
        return A;
    }
}
