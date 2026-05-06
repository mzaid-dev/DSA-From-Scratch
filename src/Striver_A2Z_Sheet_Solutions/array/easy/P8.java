package Striver_A2Z_Sheet_Solutions.array.easy;
// Union of Two Sorted Arrays

import java.util.HashSet;

public class P8 {
    public static HashSet<Integer> findUnion(int[] a,int[] b,int n,int m) {
        HashSet<Integer> union = new HashSet<>();


        for (int i = 0; i < n; i++) {
             union.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            union.add(b[i]);
        }

        return union;
    }
    public static void main(String[] args) {

        int[] a = {1,2,4,6,7};
        int  n = a.length;

        int[] b = {4,5,9,10};
        int m = b.length;

        System.out.println(findUnion(a, b, n, m));
        }
}