/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author oscar neiva
 */
public class Generator {
    private Random random;
    
    // Generate random numbers and write them on the text file.
    public void generateNumbers() throws IOException{
        random = new Random();
        for(int i=0; i<1000000; i++){
            String fileContent = String.valueOf(random.nextInt(1000000)) + ",";
            FileWriter fileWriter = new FileWriter("./data/data.csv", true);
            fileWriter.write(fileContent);
            fileWriter.close();
            System.out.println(i);
        }
    }
}
