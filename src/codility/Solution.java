package codility;

/**
 * @author michael.malevannyy@gmail.com, 31.03.2017
 */

import java.util.*;

public class Solution {
    int solution(int[] A, int[] B)
    {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int k = 0;
        for (int i = 0; i < n; i++)
        {
            while (k < m - 1 && B[k] < A[i])
                k += 1;

            if (A[i] == B[k])
                return A[i];
        }

        return -1;
    }
}