import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadOne
{
    public static void main(String[] args)
    {
        /* We must use a try/catch when reading 
         * in a file in case the file is not found
         */
        try {
            // Create the Scanner object using the file
            // as input
            Scanner fileIn = new Scanner(new File("/Users/jake/Desktop/Projects/FileIOJava/Step1/input.txt"));
            
            /* Loop while the file still has lines.
             * .hasNext() looks to see if a line exists
             * ,but it doesn't read the line.
             */
            while (fileIn.hasNext()) 
            {
                // Reads the entire line
                String lineIn = fileIn.nextLine(); 
                // Output the line
                System.out.println(lineIn);
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}