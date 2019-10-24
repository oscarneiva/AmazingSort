/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author oscar neiva
 */
public class BubbleSort {
    
    // Class constructor
    public BubbleSort(){
    
    }
    
    // Sorts the array
    public void sort(int[] array){
        System.out.println("Array sorting...");
        int n = array.length; 
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (array[j] > array[j+1]){ 
                    int temp = array[j]; 
                    array[j] = array[j+1]; 
                    array[j+1] = temp;
                } 
            }      
        }
        System.out.println("Array Sorted!");
        //printArray(array);
    }
    
    // Prints the array
    void printArray(int array[]){ 
        System.out.println("Printing the array... ");
        int n = array.length; 
        for (int i=0; i<n; i++) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    } 
    
    // Sorts the list
    public void sort(LinkedList<Integer> list){
        System.out.println("List sorting...");
        int n = list.size();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (list.get(j) > list.get(j+1)){ 
                    int temp = list.get(j); 
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                } 
            }      
        }
        System.out.println("List Sorted!");
        //printList(list);
    }
    
    // Prints the list
    void printList(LinkedList<Integer> list){ 
        System.out.println("Printing the list... ");
        int n = list.size();
        for (int i=0; i<n; i++) 
            System.out.print(list.get(i) + " "); 
        System.out.println(); 
    } 
    
    // Sorts the stack
    public void sort(Stack<Integer> stack){
        System.out.println("Stack sorting... ");
        int n = stack.size();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (stack.get(j) > stack.get(j+1)){ 
                    int temp = stack.get(j); 
                    stack.set(j, stack.get(j+1));
                    stack.set(j+1, temp);
                } 
            }      
        }
        System.out.println("Stack Sorted!");
        //printList(stack);
    }
    
    // Prints the stack
    void printList(Stack<Integer> stack){ 
        System.out.println("Printing the stack... ");
        int n = stack.size();
        for (int i=0; i<n; i++) 
            System.out.print(stack.get(i) + " "); 
        System.out.println(); 
    } 
}
