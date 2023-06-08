package algorithms;

import java.util.Arrays;
import java.util.LinkedList;

public class RadixSort {

    public RadixSort(){

    }

    // Array get max
    public int getMax(int arr[], int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // Array count sort
    public void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        for (i = 1; i < 10; i++){
            count[i] += count[i - 1];
        }

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    // Array sort
    public void sort(int arr[], int n) {
        double startTime = System.nanoTime();
        int m = getMax(arr, n);
        for (int exp = 1; m / exp > 0; exp *= 10){
            countSort(arr, n, exp);
        }
        double endTime = System.nanoTime();
        double time = (endTime - startTime)/Math.pow(10, 9);
        System.out.println("List Sorted! Time: " + time + " seconds.");
    }

    // List get max
    public int getMax(LinkedList<Integer> list, int n) {
        int max = list.get(0);
        for (int i = 1; i < n; i++){
            if (list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    // List count sort
    public void countSort(LinkedList<Integer> list, int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++) {
            count[(list.get(i) / exp) % 10]++;
        }

        for (i = 1; i < 10; i++){
            Integer x = list.get(i) + list.get(i-1);
            list.set(i, x);
        }

        for (i = n - 1; i >= 0; i--) {
            output[count[(list.get(i) / exp) % 10] - 1] = list.get(i);
            count[(list.get(i) / exp) % 10]--;
        }

        for (i = 0; i < n; i++) {
            list.set(i, output[i]);
        }
    }

    // List sort
    public void sort(LinkedList<Integer> list, int n) {
        double startTime = System.nanoTime();
        int m = getMax(list, n);
        for (int exp = 1; m / exp > 0; exp *= 10){
            countSort(list, n, exp);
        }
        double endTime = System.nanoTime();
        double time = (endTime - startTime)/Math.pow(10, 9);
        System.out.println("List Sorted! Time: " + time + " seconds.");
    }
}
