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
 * @author Oscar Neiva
 */
public class MergeSort {
    
    // Class constructor
    public MergeSort(){
    
    }
    
    // Sorts the array
    public void sort(int array[], int l, int r){
        System.out.println("Sorting the array...");
        sorting(array, l, r);
        System.out.println("Array sorted!");
        printArray(array);
    }
    
    // Sorting the array
    public void sorting(int array[], int l, int r){ 
        if (l < r){
            int m = (l+r)/2;
            sorting(array, l, m); 
            sorting(array , m+1, r); 
            merge(array, l, m, r); 
        }     
    } 
    
    // Merges two subarrays 
    public void merge(int array[], int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; i++){
            L[i] = array[l + i]; 
        } 
            
        for (int j=0; j<n2; j++){
            R[j] = array[m + 1 + j];
        }
            
        int i = 0, j = 0;
  
        int k = l; 
        while(i < n1 && j < n2){ 
            if (L[i] <= R[j]){ 
                array[k] = L[i]; 
                i++; 
            }else{ 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
 
        while(i < n1){ 
            array[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while(j < n2){ 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Prints the array
    public void printArray(int array[]){ 
        int n = array.length; 
        for (int i=0; i<n; i++){
            System.out.print(array[i] + " "); 
        }   
        System.out.println(); 
    } 
    
    // Sorts the list
    public void sort(LinkedList<Integer> list, int l, int r){
        System.out.println("Sorting the list...");
        sorting(list, l, r);
        System.out.println("List sorted!");
        printList(list);
    }
    
    // Sorting the list
    public void sorting(LinkedList<Integer> list, int l, int r){ 
        if (l < r){
            int m = (l+r)/2;
            sorting(list, l, m); 
            sorting(list, m+1, r);
            merge(list, l, m, r); 
        }     
    } 
    
    // Merges two sublists
    public void merge(LinkedList<Integer> list, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; i++){
            L[i] = list.get(l+i); 
        } 
            
        for (int j=0; j<n2; j++){
            R[j] = list.get(m + 1 + j);
        }
            
        int i = 0, j = 0;
  
        int k = l; 
        while(i < n1 && j < n2){ 
            if (L[i] <= R[j]){ 
                list.set(k, L[i]); 
                i++; 
            }else{ 
                list.set(k, R[j]); 
                j++; 
            } 
            k++; 
        } 
 
        while(i < n1){ 
            list.set(k, L[i]); 
            i++; 
            k++; 
        } 
  
        while(j < n2){ 
            list.set(k, R[j]);
            j++; 
            k++; 
        } 
    } 
  
    // Prints the list
    public void printList(LinkedList<Integer> list){ 
        int n = list.size(); 
        for (int i=0; i<n; i++){
            System.out.print(list.get(i) + " "); 
        }   
        System.out.println(); 
    } 
    
    // Sorts the stack
    public void sort(Stack<Integer> stack, int l, int r){
        System.out.println("Sorting the stack...");
        sorting(stack, l, r);
        System.out.println("Stack sorted!");
        printStack(stack);
    }
    
    // Sorting the stack
    public void sorting(Stack<Integer> stack, int l, int r){ 
        if (l < r){
            int m = (l+r)/2;
            sorting(stack, l, m); 
            sorting(stack, m+1, r);
            merge(stack, l, m, r); 
        }     
    } 
    
    // Merges two substacks
    public void merge(Stack<Integer> stack, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; i++){
            L[i] = stack.get(l+i); 
        } 
            
        for (int j=0; j<n2; j++){
            R[j] = stack.get(m + 1 + j);
        }
            
        int i = 0, j = 0;
  
        int k = l; 
        while(i < n1 && j < n2){ 
            if (L[i] <= R[j]){ 
                stack.set(k, L[i]); 
                i++; 
            }else{ 
                stack.set(k, R[j]); 
                j++; 
            } 
            k++; 
        } 
 
        while(i < n1){ 
            stack.set(k, L[i]); 
            i++; 
            k++; 
        } 
  
        while(j < n2){ 
            stack.set(k, R[j]);
            j++; 
            k++; 
        } 
    } 
  
    // Prints the stack
    public void printStack(Stack<Integer> stack){ 
        int n = stack.size(); 
        for (int i=0; i<n; i++){
            System.out.print(stack.get(i) + " "); 
        }   
        System.out.println(); 
    } 
}
