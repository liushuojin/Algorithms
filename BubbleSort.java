import java.util.*;

public class BubbleSort {
    public int[] bubbleSort(int[] A, int n) {
        // write code here
        for(int i = n - 1; i >= 1; --i){
            for(int j = 0; j < i; ++j){
                if(A[j] > A[j + 1]){
                    int t = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = t;
                }
            }
        }
        return A;
    }
}
