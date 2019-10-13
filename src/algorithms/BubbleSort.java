/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;
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
public class BubbleSort {
    private int[][] array;
    private LinkedList<Integer> linkedlist;
    private Queue<Integer> queue;
    private Stack<String> stackOfCards;
    
    // Class constructor.
    public BubbleSort(int x, int y){
        array = new int[x][y];
        linkedlist = new LinkedList<Integer>();
        queue = new LinkedList<Integer>();
        stackOfCards = new Stack<>();
    } 
    
    // Read the data from the text file.
    public void readTextFile() throws IOException{
        FileReader fileReader = new FileReader("./data/data.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String fileContent; 
        String[] fileData = null;
        while((fileContent = bufferedReader.readLine()) != null) {
            fileContent.trim();
            fileData = fileContent.split(","); 
            
            //user = new User(fileData[0], fileData[1], fileData[2]);
            //users.add(user);
        }
         
        for(int i = 0; i < 10000; i++) {
            System.out.println(fileData[i]);
        }
        
        fileReader.close();
    }
}
