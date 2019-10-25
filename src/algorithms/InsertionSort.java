/*
 * This class contains the Insertion Sort algorithm applied to 
 * different structures. Polymorphic methods are used to simplify
 * the process of colling these methods.
 */

package algorithms;
import java.util.LinkedList;
import java.util.Stack;

public class InsertionSort {
    
    // Class constructor.
    public InsertionSort(){
    
    }
    
    // Sorts the array
    public void sort(int array[]){ 
        System.out.println("Sorting the array...");
        double startTime = System.nanoTime();
        int n = array.length; 
        for (int i = 0; i < n; i++) { 
            int key = array[i]; 
            int j = i - 1; 
            while (j >= 0 && array[j] > key) { 
                array[j + 1] = array[j]; 
                j = j - 1; 
            } 
            array[j + 1] = key; 
        } 
        double endTime   = System.nanoTime();
        double time = (endTime - startTime)/Math.pow(10, 9);
        System.out.println("Array Sorted! Time: " + time + " seconds.");
        //printArray(array);
    } 
  
    // Prints the array
    public void printArray(int array[]){ 
        int n = array.length;
        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(); 
    }
    
    // Sorts the list
    public void sort(LinkedList<Integer> list){ 
        System.out.println("Sorting the list...");
        double startTime   = System.nanoTime();
        int n = list.size();
        for (int i = 0; i < n; i++) { 
            int key = list.get(i); 
            int j = i - 1; 
            while (j >= 0 && list.get(j) > key) { 
                list.set(j+1, list.get(j)); 
                j = j - 1; 
            } 
            list.set(j+1, key); 
        } 
        double endTime   = System.nanoTime();
        double time = (endTime - startTime)/Math.pow(10, 9);
        System.out.println("List Sorted! Time: " + time + " seconds.");
        //printList(list);
    } 
  
    // Prints the list
    public void printList(LinkedList<Integer> list){ 
        int n = list.size();
        for (int i = 0; i < n; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); 
    }
    
    // Sorts the stack
    public void sort(Stack<Integer> stack){ 
        System.out.println("Sorting the stack...");
        double startTime   = System.nanoTime();
        int n = stack.size();
        for (int i = 0; i < n; i++) { 
            int key = stack.get(i); 
            int j = i - 1; 
            while (j >= 0 && stack.get(j) > key) { 
                stack.set(j+1, stack.get(j)); 
                j = j - 1; 
            } 
            stack.set(j+1, key); 
        } 
        double endTime   = System.nanoTime();
        double time = (endTime - startTime)/Math.pow(10, 9);
        System.out.println("Stack Sorted! Time: " + time + " seconds.");
        //printStack(stack);
    } 
  
    // Prints the stack
    public void printStack(Stack<Integer> stack){ 
        int n = stack.size();
        for (int i = 0; i < n; i++){
            System.out.print(stack.get(i) + " ");
        }
        System.out.println(); 
    }
}
