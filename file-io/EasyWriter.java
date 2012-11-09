/*  Reads from easy.txt, writes to easy-backup.txt.
    Copyright (C) 2012 James Heslin

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

// When you write example code, you get to make puns like this
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
