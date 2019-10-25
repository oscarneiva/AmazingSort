/*
 * This class is in charge of generating the elements for 
 * the simulation.
 */

package generator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Generator {
    private Random random;
    
    // Generate random numbers and write them on the text file.
    public void generateNumbers(int number) throws IOException{
        deleteContent();
        
        random = new Random();
        for(int i=0; i<number; i++){
            String fileContent = String.valueOf(random.nextInt(number)) + ",";
            FileWriter fileWriter = new FileWriter("./data/data.csv", true);
            fileWriter.write(fileContent);
            fileWriter.close();
            System.out.println(i);
        }
    }
    
    // Delete the data from the csv file.
    public void deleteContent()throws IOException{
        PrintWriter writer = new PrintWriter("./data/data.csv");
        writer.print("");
        writer.close();
    }
}
