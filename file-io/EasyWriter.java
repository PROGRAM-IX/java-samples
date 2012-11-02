import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

// When you're a PSLG leader, you get to make puns like this
public class EasyWriter
{
    // This will run when you run 'java EasyWriter'
    public static void main(String[] args)
    {
        // Something bad might go down...
        try
        {
            // Create storage ArrayList
            ArrayList<String> al = new ArrayList<String>();
            // Create basic reader (original file)
            FileReader fr = new FileReader("easy.txt");
            // Create efficient reader
            BufferedReader br = new BufferedReader(fr);
            // Create basic writer (backup file)
            FileWriter fw = new FileWriter("easy-backup.txt");
            // Create efficient writer
            BufferedWriter bw = new BufferedWriter(fw);
            // While there is text to be read
            while (br.ready())
            {
                // Store the next line in the ArrayList
                al.add(br.readLine());
            }
            // Step through the ArrayList
            for(int i = 0; i < al.size(); i++)
            {
                // Write each element to the backup file
                bw.write(al.get(i));
                // Write a newline character 
                bw.newLine();
            }
            // Finish with the original file
            br.close();
            // Finish with (save) the backup file
            bw.close();
        }
        // If something bad went down...
        catch(IOException e)
        {
            // Print any errors we get
            System.out.println(e.getMessage());
        }
    }
}
