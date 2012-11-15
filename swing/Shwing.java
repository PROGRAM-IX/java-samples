import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Shwing extends JFrame
{
    public Shwing()
    {
        // Call method to initialise GUI
        initUI();
    }
    public static void main(String[] args)
    {
        // Create object of our class
        Shwing s = new Shwing();
        // Set it to be drawn to the screen
        s.setVisible(true);
    }
    public final void initUI()
    {
        // Create two panels
        JPanel panel = new JPanel();
        JPanel innerPanel = new JPanel();
        // Add the main panel to the frame
        this.getContentPane().add(panel);
        
        // Set a LayoutManager for the panel
        panel.setLayout(new FlowLayout());
        // Set text to pop up on mouse hover
        panel.setToolTipText("A Panel container");

        // Make a button
        JButton button = new JButton("Make Popup");
        // Another pop up text on mouse hover
        button.setToolTipText("A button component");
        // Add an anonymous listener to the button
        button.addActionListener(
            // This will listen for any event happening to the button
            new ActionListener()
               {    
                    // Must implement this abstract method 
                    public void actionPerformed(ActionEvent e)
                    {
                        // Take in a string using a popup pane
                        String a = JOptionPane.showInputDialog
                            (null, "Enter a string");
                        // Print the string back out
                        JOptionPane.showMessageDialog
                            (null, "The string was " + a);
                    }
                });

        // Create a label
        JLabel label = new JLabel("Button");
    
        // Set up the inner panel
        innerPanel.add(label);
        innerPanel.add(button);
        // Add the inner panel to the main panel
        panel.add(innerPanel);

        // Set the window title
        setTitle("SHWING");
        // Set window size
        setSize(300, 200);
        // Don't set position relative to another window
        setLocationRelativeTo(null);
        // Set the default operation for when the X (close) button activates
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
