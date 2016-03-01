//运行错误:请检查是否存在数组越界非法访问，野指针乱访问，空指针乱访问等情况
//wrong code
import java.util.*;

public class MergeSort {
    public int[] mergeSort(int[] A, int n) {
        // write code here
        int width = 1, bi;//bindex
        int[] B = new int[n + 1];
        while(width < n){
            width *= 2;
            int l1,r1,l2,r2;
            for(int i = 0; i < n - 1; i += width){
                bi = 0;
                l1 = i;
                r1 = i + width / 2 - 1 > n - 1 ?  n - 1 : i + width / 2 - 1;
                l2 = i + width / 2 > n - 1 ? n - 1 : i + width / 2;
                r2 = i + width - 1 > n - 1 ? n - 1 : i + width - 1;
                //System.out.println("呵呵" + l1 + ' ' + r1 + ' ' + l2 + ' ' + r2 + "结束");
                int l = l1;
                while(r1 != l2 && l1 <= r1 && l2 <= r2){
                    if(A[l1] <= A[l2]){
                        B[bi++] = A[l1++];
                    } else {
                        B[bi++] = A[l2++];
                    }
                }
                while(l1 <= r1){
                    B[bi++] = A[l1++];
                }  
                while(r1 != l2 && l2 <= r2){
                    B[bi++] = B[l2++];
                }
                for(int k = 0; k < bi; k++){
                    A[l++] = B[k];
                }
            }
        }
        return A;
    }
}
