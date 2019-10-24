/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.LinkedList;

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
        if (l < r){
            int m = (l+r)/2;
            sort(array, l, m); 
            sort(array , m+1, r); 
            merge(array, l, m, r); 
        }     
        System.out.println("Array sorted!");
        printArray(array);
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
        if (l < r){
            int m = (l+r)/2;
            sort(list, l, m); 
            sort(list, m+1, r);
            merge(list, l, m, r); 
        }     
        
        System.out.println("List sorted!");
        printList(list);
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
}
