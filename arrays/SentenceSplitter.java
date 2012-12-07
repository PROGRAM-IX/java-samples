/*
 * Write a program that takes a sentence as input, and outputs two lists of
 * words: one list of the words in the sentence that start with a vowel, and
 * one list of the words in the sentence that start with a consonant.
 */
import javax.swing.JOptionPane;

public class SentenceSplitter
{
    public static void main(String[] args)
    {
        // Take input
        String sentence = JOptionPane.showInputDialog(null, "Sentence");
        // Assume full stop at the end
        sentence = sentence.substring(0, sentence.length()-1);
        // Split the string on space characters
        String[] allWords = sentence.split(" ");
        String[] vWords = new String[allWords.length];
        String[] cWords = new String[allWords.length];
        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        String temp; 
        int vCount = 0;
        int cCount = 0;
        int i = 0;
        for(i = 0; i < allWords.length; i++)
        {
            temp = allWords[i].substring(0, 1);
            if(vowels.indexOf(temp) > -1)
            {
                vWords[vCount] = allWords[i];
                vCount++;
            }
            else if(consonants.indexOf(temp) > -1)
            {
                cWords[cCount] = allWords[i];
                cCount++;
            }
        }
        String vResult = "";
        String cResult = "";
        for (i = 0; i < vCount; i++)
        {
            vResult = vResult + vWords[i] + "\n";
        }
        for(i = 0; i < cCount; i++)
        {
            cResult = cResult + cWords[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, vResult);
        JOptionPane.showMessageDialog(null, cResult);
    }
}


