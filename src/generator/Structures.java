/*
 * This class contains the data strutures that can be used on the 
 * simulations.
 */

package generator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Structures {
    private int[] array;
    private LinkedList<Integer> linkedlist;
    private Queue<Integer> queue;
    private Stack<Integer> stack;
    private String[] fileData;
    
    // Class constructor.
    public Structures() throws IOException{
        readTextFile();
    } 
    
    // Read the data from the text file.
    public void readTextFile() throws IOException{
        System.out.println("Starting text file reading...");
        FileReader fileReader = new FileReader("data/data.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String fileContent;
        while((fileContent = bufferedReader.readLine()) != null) {
            fileContent.trim();
            fileData = fileContent.split(",");
        }
        
        System.out.println("Text file read. RAM memory is loaded.");
        fileReader.close();
    }
    
    // Method to fill the array.
    public int[] fillArray(int number){
        System.out.println("Starting array filling...");
        
        array = new int[number];
        
        for(int i=0; i<number; i++){
            array[i] = Integer.valueOf(fileData[i]);
        }
        System.out.println("Array filled!");
        return array;
    }
    
    // Method to fill the linked list.
    public LinkedList<Integer> fillList(int number){
        System.out.println("Starting list filling...");
        
        linkedlist = new LinkedList<>();
        
        for(int i=0; i<number; i++){
            linkedlist.add(Integer.valueOf(fileData[i]));
        }
        System.out.println("List filled!");
        return linkedlist;
    }
    
    // Method to fill the queue.
    public Queue<Integer> fillQueue(int number){
        System.out.println("Starting queue filling...");
        
        queue = new LinkedList<>();
        
        for(int i=0; i<number; i++){
            queue.add(Integer.valueOf(fileData[i]));
        }
        System.out.println("Queue filled!");
        return queue;
    }
    
    // Method to fill the stack.
    public Stack<Integer> fillStack(int number){
        System.out.println("Starting stack filling...");
        
        stack = new Stack<>();
        
        for(int i=0; i<number; i++){
            stack.add(Integer.valueOf(fileData[i]));
        }
        System.out.println("Stack filled!");
        return stack;
    }
}
