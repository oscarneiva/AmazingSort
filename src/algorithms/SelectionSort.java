/*
 * This class contains the Selection Sort algorithm applied to 
 * different structures. Polymorphic methods are used to simplify
 * the process of colling these methods.
 */

package algorithms;
import java.util.LinkedList;
import java.util.Stack;

public class SelectionSort {
    
    // Class constructor
    public SelectionSort(){
    
    }
    
    // Sorts the array
    public void sort(int array[]){
        System.out.println("Sorting the array...");
        int n = array.length; 
  
        for (int i = 0; i < n-1; i++){ 
            int min_idx = i; 
            for (int j = i+1; j < n; j++){
                if (array[j] < array[min_idx]){
                    min_idx = j; 
                }
            }
            
            int temp = array[min_idx]; 
            array[min_idx] = array[i]; 
            array[i] = temp; 
        }
        
        System.out.println("Array sorted!");
        printArray(array);
    }
    
    // Prints the array 
    void printArray(int array[]){ 
        int n = array.length; 
        for (int i=0; i<n; ++i){
            System.out.print(array[i]+" ");
        } 
        System.out.println(); 
    }
    
    // Sorts the list
    public void sort(LinkedList<Integer> list){
        System.out.println("Sorting the list...");
        int n = list.size(); 
  
        for (int i = 0; i < n-1; i++){ 
            int min_idx = i; 
            for (int j = i+1; j < n; j++){
                if (list.get(j) < list.get(min_idx)){
                    min_idx = j; 
                }
            }
            
            int temp = list.get(min_idx); 
            list.set(min_idx, list.get(i)); 
            list.set(i, temp); 
        }
        
        System.out.println("List sorted!");
        printList(list);
    }
    
    // Prints the list
    void printList(LinkedList<Integer> list){ 
        int n = list.size();
        for (int i=0; i<n; ++i){
            System.out.print(list.get(i)+" ");
        } 
        System.out.println(); 
    }
    
    // Sorts the stack
    public void sort(Stack<Integer> stack){
        System.out.println("Sorting the stack...");
        int n = stack.size(); 
  
        for (int i = 0; i < n-1; i++){ 
            int min_idx = i; 
            for (int j = i+1; j < n; j++){
                if (stack.get(j) < stack.get(min_idx)){
                    min_idx = j; 
                }
            }
            
            int temp = stack.get(min_idx); 
            stack.set(min_idx, stack.get(i)); 
            stack.set(i, temp); 
        }
        
        System.out.println("Stack sorted!");
        printStack(stack);
    }
    
    // Prints the stack
    void printStack(Stack<Integer> stack){ 
        int n = stack.size();
        for (int i=0; i<n; i++){
            System.out.print(stack.get(i)+" ");
        } 
        System.out.println(); 
    }
}
