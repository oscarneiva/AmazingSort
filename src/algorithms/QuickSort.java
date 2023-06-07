/*
 * This class contains the Quick Sort algorithm applied to 
 * different structures. Polymorphic methods are used to simplify
 * the process of colling these methods.
 */

package algorithms;
import java.util.LinkedList;
import java.util.Stack;

public class QuickSort {
    
    // Class constructor.
    public QuickSort(){
    
    }
    
    // Sorts the array.
    public void sort(int array[], int low, int high){
        System.out.println("Sorting the array...");
        double startTime = System.nanoTime();
        sorting(array, low, high);
        double endTime = System.nanoTime();
        double time = (endTime - startTime)/Math.pow(10, 9);
        System.out.println("Array Sorted! Time: " + time + " seconds.");
        //printArray(array);
    }
    
    // Sorting the array.
    public void sorting(int array[], int low, int high){
        if (low < high){ 
            int pi = partition(array, low, high);
            sorting(array, low, pi-1); 
            sorting(array, pi+1, high); 
        } 
    }
    
    // Estimates the pivot.
    int partition(int array[], int low, int high){ 
        int pivot = array[high];  
        int i = (low-1);
        for (int j=low; j<high; j++){ 
            if (array[j] < pivot){ 
                i++;
                int temp = array[i]; 
                array[i] = array[j]; 
                array[j] = temp; 
            } 
        } 
        int temp = array[i+1]; 
        array[i+1] = array[high]; 
        array[high] = temp; 
        return i+1; 
    } 
    
    // Prints the array.
    public void printArray(int array[]){ 
        int n = array.length; 
        for (int i=0; i<n; ++i){
            System.out.print(array[i]+" ");
        }
        System.out.println(); 
    } 
    
    // Sorts the list.
    public void sort(LinkedList<Integer> list, int low, int high){
        System.out.println("Sorting the list...");
        double startTime = System.nanoTime();
        sorting(list, low, high);
        double endTime = System.nanoTime();
        double time = (endTime - startTime)/Math.pow(10, 9);
        System.out.println("List Sorted! Time: " + time + " seconds.");
        //printList(list);
    }
    
    // Sorting the list.
    public void sorting(LinkedList<Integer> list, int low, int high){
        if (low < high){ 
            int pi = partition(list, low, high);
            sorting(list, low, pi-1); 
            sorting(list, pi+1, high); 
        } 
    }
    
    // Estimates the pivot.
    int partition(LinkedList<Integer> list, int low, int high){ 
        int pivot = list.get(high);  
        int i = (low-1);
        for (int j=low; j<high; j++){ 
            if (list.get(j) < pivot){ 
                i++;
                int temp = list.get(i); 
                list.set(i, list.get(j)); 
                list.set(j, temp); 
            } 
        } 
        int temp = list.get(i+1); 
        list.set(i+1, list.get(high)); 
        list.set(high, temp); 
        return i+1; 
    }
    
    // Prints the list.
    public void printList(LinkedList<Integer> list){ 
        int n = list.size(); 
        for (int i=0; i<n; ++i){
            System.out.print(list.get(i)+" ");
        }     
        System.out.println(); 
    } 
    
    // Sorts the stack.
    public void sort(Stack<Integer> stack, int low, int high){
        System.out.println("Sorting the stack...");
        double startTime = System.nanoTime();
        sorting(stack, low, high);
        double endTime = System.nanoTime();
        double time = (endTime - startTime)/Math.pow(10, 9);
        System.out.println("Stack Sorted! Time: " + time + " seconds.");
        //printStack(stack);
    }
    
    // Sorting the stack.
    public void sorting(Stack<Integer> stack, int low, int high){
        if (low < high){ 
            int pi = partition(stack, low, high);
            sorting(stack, low, pi-1); 
            sorting(stack, pi+1, high); 
        } 
    }
    
    // Estimates the pivot.
    int partition(Stack<Integer> stack, int low, int high){ 
        int pivot = stack.get(high);  
        int i = (low-1);
        for (int j=low; j<high; j++){ 
            if (stack.get(j) < pivot){ 
                i++;
                int temp = stack.get(i); 
                stack.set(i, stack.get(j)); 
                stack.set(j, temp); 
            } 
        } 
        int temp = stack.get(i+1); 
        stack.set(i+1, stack.get(high)); 
        stack.set(high,temp); 
        return i+1; 
    } 
    
    // Prints the stack.
    public void printStack(Stack<Integer> stack){ 
        int n = stack.size(); 
        for (int i=0; i<n; ++i){
            System.out.print(stack.get(i)+" ");
        }     
        System.out.println(); 
    } 
}
