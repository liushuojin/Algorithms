import java.util.*;

public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        // write code here
        for (int i = 1; i < n; ++i){
            int k = i;
            for(int j = i - 1; j >= 0; --j){
                if(A[k] < A[j]){
                    int t = A[j];
                    A[j] = A[k];
                    A[k] = t;
                    k = j;
                }
            }
        }
        return A;
    }
}
