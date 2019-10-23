/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;
import algorithms.BubbleSort;
import algorithms.SelectionSort;
import generator.Generator;
import generator.Structures;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Oscar Neiva
 */
public class SortingAlgorithms {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        
        System.out.println("|----------------------------------------------|");
        System.out.println("|         Welcome to the amazing sort!         |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| 0 - To generate random numbers.              |");
        System.out.println("| 1 - To sort the numbers using bubble sort.   |");
        System.out.println("| 2 - To sort the numbers using selection sort.|");
        System.out.println("| 3 - To sort the numbers using merge sort.    |");
        System.out.println("| 4 - To sort the numbers using quick sort.    |");
        System.out.println("| 5 - To sort the numbers using insertion sort.|");
        System.out.println("|----------------------------------------------|");
        
        Structures structures = new Structures();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        int number;
        
        switch(option){
            case 0:
                System.out.println("Starting numbers generator... ");
                Generator generator = new Generator();
                generator.generateNumbers();
            break;
            case 1:
                System.out.println("Bubble sort selected... ");
                System.out.print("How many elements: ");
                number = scanner.nextInt();
                
                BubbleSort bubblesort = new BubbleSort();
                bubblesort.sort(structures.fillArray(number));
                bubblesort.sort(structures.fillList(number));
                bubblesort.sort(structures.fillStack(number));
            break;
            case 2:
                System.out.println("Selection sort selected... ");
                System.out.print("How many elements: ");
                number = scanner.nextInt();
                
                SelectionSort selectionsort = new SelectionSort();
                selectionsort.sort(structures.fillArray(number));
                selectionsort.sort(structures.fillList(number));
                selectionsort.sort(structures.fillStack(number));
            break;
            case 3:
                System.out.println("Merge sort selected... ");
                System.out.print("How many elements: ");
                number = scanner.nextInt();
                
            break;
            case 4:
                System.out.println("Quick sort selected... ");
                System.out.print("How many elements: ");
                number = scanner.nextInt();
                
            break;
            case 5:
                System.out.println("Insertion sort selected... ");
                System.out.print("How many elements: ");
                number = scanner.nextInt();
                
            break;  
            default:
                System.out.println("ERROR: Invalid option!");
        }
    }
    
}
