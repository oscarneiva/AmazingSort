/*
 * Amazing sort is a java program to test different sorting algorithms
 * with different sets of data. These sets differ on amount of elements 
 * and on the generated element, for each time that the generator is executed
 * new and different sets of numbers are created.
 */

package sortingalgorithms;
import algorithms.BubbleSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;
import algorithms.SelectionSort;
import generator.Generator;
import generator.Structures;
import java.io.IOException;
import java.util.Scanner;

public class SortingAlgorithms {
    
    // Main loop with the algorithms options
    public static void main(String[] args) throws IOException, InterruptedException {
        Structures structures = new Structures();
        Scanner scanner = new Scanner(System.in);
        int option = 7;
        int number;
        
        while(option != 6){
            System.out.println();
            System.out.println("Press enter to clean and start:");
            System.in.read();
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            
            System.out.println("|----------------------------------------------|");
            System.out.println("|                Amazing sort                  |");
            System.out.println("|----------------------------------------------|");
            System.out.println("| 0 - To generate random numbers.              |");
            System.out.println("| 1 - To sort the numbers using bubble sort.   |");
            System.out.println("| 2 - To sort the numbers using selection sort.|");
            System.out.println("| 3 - To sort the numbers using insertion sort.|");
            System.out.println("| 4 - To sort the numbers using merge sort.    |");
            System.out.println("| 5 - To sort the numbers using quick sort.    |");
            System.out.println("|----------------------------------------------|");
            System.out.print("Option: "); 
            option = scanner.nextInt();

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
                    System.out.println("Insertion sort selected... ");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();
                    
                    InsertionSort insertionsort = new InsertionSort();
                    insertionsort.sort(structures.fillArray(number));
                    insertionsort.sort(structures.fillList(number));
                    insertionsort.sort(structures.fillStack(number));
                break;
                case 4:
                    System.out.println("Merge sort selected... ");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();

                    MergeSort mergesort = new MergeSort();
                    mergesort.sort(structures.fillArray(number), 0, number-1);
                    mergesort.sort(structures.fillList(number), 0, number-1);
                    mergesort.sort(structures.fillStack(number), 0, number-1);
                break;
                case 5:
                    System.out.println("Quick sort selected... ");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();
                    
                    QuickSort quicksort = new QuickSort();
                    quicksort.sort(structures.fillArray(number), 0, number-1);
                    quicksort.sort(structures.fillList(number), 0, number-1);
                    quicksort.sort(structures.fillStack(number), 0, number-1);
                break;  
                case 6:
                    System.out.println("Exiting the program... ");
                break;
                default:
                    System.out.println("ERROR: Invalid option!");
                break;
            }
        }
    }
    
}
