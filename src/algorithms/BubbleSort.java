/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author oscar neiva
 */
public class BubbleSort {
    
    // Class constructor.
    public BubbleSort(){
    
    }
    
    public void sort(int[] arr){
        int n = arr.length; 
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){ 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp;
                } 
            }      
        }
    }
}
