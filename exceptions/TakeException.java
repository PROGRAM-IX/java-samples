import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.FileReader;
import java.util.Scanner;

public class TakeException
{
    public static void main(String args[])
    {
        FileReader f;
        int a = 0;
        int b = 0;
        int[] c;
        Scanner input = new Scanner(System.in);
        String s = null;
        while(true)
        {   
            try
            {
                //input.flush();
                input = new Scanner(System.in);
                System.out.print("Enter a number: ");
                a = Integer.parseInt(input.nextLine());
                System.out.print("Enter a number: ");
                b = input.nextInt();
                f = new FileReader("derp.txt");
                c = new int[b];
                System.out.println(c[10]);
                //if (s == null)
                //{
                    //throw new Exception();
                //}
                System.out.println(s.length());
            }
            catch(NumberFormatException nfe)
            {
                nfe.printStackTrace();
                // we know that a is the only value that would cause this
                a = 10;
                System.out.println("Number Format is incorrect!");
            }
            catch(InputMismatchException ime)
            {
                ime.printStackTrace();
                System.out.println("Input Mismatch! Did you enter a non-digit character?");
            }
            catch(FileNotFoundException fnfe)
            {
                fnfe.printStackTrace();
                System.out.println("File not found!");
            }
            catch(IOException ioe)
            {
                ioe.printStackTrace();
            }
            catch(IndexOutOfBoundsException ioobe)
            {
                ioobe.printStackTrace();
                System.out.println("Index out of bounds!");
            }
            catch(NullPointerException npe)
            {
                npe.printStackTrace();
                System.out.println("That's null!");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            System.out.println(a);
            System.out.println("Reached end of loop");
        }
    }
}

