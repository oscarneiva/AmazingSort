/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import generator.Structures;
import generator.Generator;
import java.io.IOException;

/**
 *
 * @author Oscar Neiva
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Generator generator = new Generator();
        generator.generateNumbers();
        //BubbleSort bubble = new Structures(10,10);
        //bubble.readTextFile();
    }
    
}
