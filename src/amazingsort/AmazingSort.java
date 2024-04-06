package amazingsort;
import algorithms.*;
import generator.Generator;
import generator.Structures;
import java.io.IOException;
import java.util.Scanner;

public class AmazingSort {

    // Main loop with the algorithms options
    public static void main(String[] args) throws IOException, InterruptedException {
        Structures structures = new Structures();
        Scanner scanner = new Scanner(System.in);
        int option = 7;
        int number;
        
        while(option != 6){
            System.out.println();
            System.out.println("Press enter to clean the window and start:");
            System.in.read();

            String osName = System.getProperty("os.name").toLowerCase();
            if (osName.contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (osName.contains("mac")) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } else {
                System.out.println("ERROR: This program cannot run in this operating system.");
            }

            System.out.println("|----------------------------------------------|");
            System.out.println("|                Amazing sort                  |");
            System.out.println("|----------------------------------------------|");
            System.out.println("| 0 - To generate a new set of random numbers. |");
            System.out.println("| 1 - To sort the numbers using bubble sort.   |");
            System.out.println("| 2 - To sort the numbers using selection sort.|");
            System.out.println("| 3 - To sort the numbers using insertion sort.|");
            System.out.println("| 4 - To sort the numbers using merge sort.    |");
            System.out.println("| 5 - To sort the numbers using quick sort.    |");
            System.out.println("| 6 - To sort the numbers using radix sort.    |");
            System.out.println("| 7 - To run all sorting algorithms.           |");
            System.out.println("| 8 - To exit.                                 |");
            System.out.println("|----------------------------------------------|");
            System.out.print("Option: "); 
            option = scanner.nextInt();

            BubbleSort bubbleSort = new BubbleSort();
            InsertionSort insertionSort = new InsertionSort();
            MergeSort mergeSort = new MergeSort();
            QuickSort quickSort = new QuickSort();
            RadixSort radixSort = new RadixSort();
            SelectionSort selectionSort = new SelectionSort();

            switch(option){
                case 0:
                    System.out.println("Starting numbers generator... ");
                    System.out.println("Attention! This will delete all the previous generated elements.");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();
                    
                    Generator generator = new Generator();
                    generator.generateNumbers(number);
                    break;
                case 1:
                    System.out.println("Bubble sort selected... ");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();

                    bubbleSort.sort(structures.fillArray(number));
                    bubbleSort.sort(structures.fillList(number));
                    break;
                case 2:
                    System.out.println("Selection sort selected... ");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();

                    selectionSort.sort(structures.fillArray(number));
                    selectionSort.sort(structures.fillList(number));
                    break;
                case 3:
                    System.out.println("Insertion sort selected... ");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();

                    insertionSort.sort(structures.fillArray(number));
                    insertionSort.sort(structures.fillList(number));
                    break;
                case 4:
                    System.out.println("Merge sort selected... ");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();

                    mergeSort.sort(structures.fillArray(number), 0, number-1);
                    mergeSort.sort(structures.fillList(number), 0, number-1);
                    break;
                case 5:
                    System.out.println("Quick sort selected... ");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();

                    quickSort.sort(structures.fillArray(number), 0, number-1);
                    quickSort.sort(structures.fillList(number), 0, number-1);
                    break;
                case 6:
                    System.out.println("Radix sort selected... ");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();

                    radixSort.sort(structures.fillArray(number));
                    radixSort.sort(structures.fillList(number));
                    break;
                case 7:
                    System.out.println("All sorting algorithms selected... ");
                    System.out.print("How many elements: ");
                    number = scanner.nextInt();

                    System.out.println("Bubble sort started...");
                    bubbleSort.sort(structures.fillArray(number));
                    bubbleSort.sort(structures.fillList(number));
                    System.out.println("Bubble sort end\n");

                    System.out.println("Selection sort started...");
                    selectionSort.sort(structures.fillArray(number));
                    selectionSort.sort(structures.fillList(number));
                    System.out.println("Selection sort end\n");

                    System.out.println("Insertion sort started...");
                    insertionSort.sort(structures.fillArray(number));
                    insertionSort.sort(structures.fillList(number));
                    System.out.println("Insertion sort end\n");

                    System.out.println("Merge sort started...");
                    mergeSort.sort(structures.fillArray(number), 0, number-1);
                    mergeSort.sort(structures.fillList(number), 0, number-1);
                    System.out.println("Merge sort end\n");

                    System.out.println("Quick sort started...");
                    quickSort.sort(structures.fillArray(number), 0, number-1);
                    quickSort.sort(structures.fillList(number), 0, number-1);
                    System.out.println("Quick sort end\n");

                    System.out.println("Radix sort started...");
                    radixSort.sort(structures.fillArray(number));
                    radixSort.sort(structures.fillList(number));
                    System.out.println("Radix sort end\n");

                    break;
                case 8:
                    System.out.println("Exiting the program... ");
                    break;
                default:
                    System.out.println("ERROR: Invalid option!");
                    break;
            }
        }
    }
}
