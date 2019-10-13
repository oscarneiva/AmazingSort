/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Oscar Neiva
 */
public class Structures {
    private int[][] array;
    private LinkedList<Integer> linkedlist;
    private Queue<Integer> queue;
    private Stack<Integer> stack;
    private String[] fileData;
    
    // Class constructor.
    public Structures(int x, int y){
        array = new int[x][y];
        linkedlist = new LinkedList<>();
        queue = new LinkedList<>();
        stack = new Stack<>();
    } 
    
    // Read the data from the text file.
    public void readTextFile() throws IOException{
        FileReader fileReader = new FileReader("./data/data.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String fileContent;
        while((fileContent = bufferedReader.readLine()) != null) {
            fileContent.trim();
            fileData = fileContent.split(","); 
        }
        
        System.out.println("Text file read.");
        fileReader.close();
    }
    
    // Method to fill the array.
    public int[][] fillArray(){
        int k = 0;
        for(int i=0; i<1000; i++){
            for(int j=0; j<1000; j++){
                array[i][j] = Integer.valueOf(fileData[k]);
                k++;
            }
        }
        System.out.println("Array filled!");
        return array;
    }
    
    // Method to fill the linked list.
    public LinkedList<Integer> fillList(){
        for(int i=0; i<1000000; i++){
            linkedlist.add(Integer.valueOf(fileData[i]));
        }
        System.out.println("List filled!");
        return linkedlist;
    }
    
    // Method to fill the queue.
    public Queue<Integer> fillQueue(){
        for(int i=0; i<1000000; i++){
            queue.add(Integer.valueOf(fileData[i]));
        }
        System.out.println("Queue filled!");
        return queue;
    }
    
    // Method to fill the stack.
    public Stack<Integer> fillStack(){
        for(int i=0; i<1000000; i++){
            stack.add(Integer.valueOf(fileData[i]));
        }
        System.out.println("Stack filled!");
        return stack;
    }
}
