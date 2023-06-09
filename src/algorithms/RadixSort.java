// https://algs4.cs.princeton.edu/51radix/MSD.java.html

package algorithms;

import java.util.LinkedList;

public class RadixSort {
    private final int BITS_PER_BYTE =   8;
    private final int BITS_PER_INT  =  32;   // each Java int is 32 bits
    private final int R             = 256;   // extended ASCII alphabet size
    private final int CUTOFF        =  15;   // cutoff to insertion sort

    public RadixSort(){

    }

    // Sort the array
    public void sort(int[] a) {
        System.out.println("Sorting the array...");
        double startTime = System.nanoTime();
        int n = a.length;
        int[] aux = new int[n];
        sort(a, 0, n-1, 0, aux);
        double endTime = System.nanoTime();
        double time = (endTime - startTime)/Math.pow(10, 9);
        System.out.println("Array Sorted! Time: " + time + " seconds.");
    }

    public void sort(int[] a, int lo, int hi, int d, int[] aux) {
        if (hi <= lo + CUTOFF) {
            insertion(a, lo, hi);
            return;
        }

        int[] count = new int[R+1];
        int mask = R - 1;
        int shift = BITS_PER_INT - BITS_PER_BYTE*d - BITS_PER_BYTE;
        for (int i = lo; i <= hi; i++) {
            int c = (a[i] >> shift) & mask;
            count[c + 1]++;
        }

        for (int r = 0; r < R; r++) {
            count[r + 1] += count[r];
        }

        if (d == 0) {
            int shift1 = count[R] - count[R/2];
            int shift2 = count[R/2];
            count[R] = shift1 + count[1];
            for (int r = 0; r < R/2; r++){
                count[r] += shift1;
            }
            for (int r = R/2; r < R; r++){
                count[r] -= shift2;
            }
        }

        // distribute
        for (int i = lo; i <= hi; i++) {
            int c = (a[i] >> shift) & mask;
            aux[count[c]++] = a[i];
        }

        for (int i = lo; i <= hi; i++){
            a[i] = aux[i - lo];
        }

        if (d == 3) return;

        if (d == 0 && count[R/2] > 0) sort(a, lo, lo + count[R/2] - 1, d+1, aux);

        if (d != 0 && count[0] > 0) sort(a, lo, lo + count[0] - 1, d+1, aux);

        for (int r = 0; r < R; r++){
            if (count[r+1] > count[r]) sort(a, lo + count[r], lo + count[r+1] - 1, d+1, aux);
        }
    }

    // insertion sort a[lo..hi]
    public void insertion(int[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++){
            for (int j = i; j > lo && a[j] < a[j-1]; j--){
                exch(a, j, j-1);
            }
        }
    }

    // exchange a[i] and a[j]
    public void exch(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Sort the list
    public void sort(LinkedList<Integer> a) {
        System.out.println("Sorting the list...");
        double startTime = System.nanoTime();
        int n = a.size();
        int[] aux = new int[n];
        sort(a, 0, n-1, 0, aux);
        double endTime = System.nanoTime();
        double time = (endTime - startTime)/Math.pow(10, 9);
        System.out.println("List Sorted! Time: " + time + " seconds.");
    }

    public void sort(LinkedList<Integer> a, int lo, int hi, int d, int[] aux) {

        if (hi <= lo + CUTOFF) {
            insertion(a, lo, hi);
            return;
        }

        int[] count = new int[R+1];
        int mask = R - 1;
        int shift = BITS_PER_INT - BITS_PER_BYTE*d - BITS_PER_BYTE;
        for (int i = lo; i <= hi; i++) {
            int c = (a.get(i) >> shift) & mask;
            count[c + 1]++;
        }

        for (int r = 0; r < R; r++){
            count[r+1] += count[r];
        }

        if (d == 0) {
            int shift1 = count[R] - count[R/2];
            int shift2 = count[R/2];
            count[R] = shift1 + count[1];
            for (int r = 0; r < R/2; r++){
                count[r] += shift1;
            }
            for (int r = R/2; r < R; r++){
                count[r] -= shift2;
            }
        }

        for (int i = lo; i <= hi; i++) {
            int c = (a.get(i) >> shift) & mask;
            aux[count[c]++] = a.get(i);
        }

        for (int i = lo; i <= hi; i++) {
            a.set(i, aux[i - lo]);
        }

        if (d == 3) return;

        if (d == 0 && count[R/2] > 0) sort(a, lo, lo + count[R/2] - 1, d+1, aux);

        if (d != 0 && count[0] > 0) sort(a, lo, lo + count[0] - 1, d+1, aux);

        for (int r = 0; r < R; r++){
            if (count[r+1] > count[r]) sort(a, lo + count[r], lo + count[r+1] - 1, d+1, aux);
        }

    }

    public void insertion(LinkedList<Integer> a, int lo, int hi) {
        for (int i = lo; i <= hi; i++){
            for (int j = i; j > lo && a.get(j) < a.get(j-1); j--){
                exch(a, j, j-1);
            }
        }
    }

    public void exch(LinkedList<Integer> a, int i, int j) {
        int temp = a.get(i);
        a.set(i,a.get(j));
        a.set(j,temp);
    }
}