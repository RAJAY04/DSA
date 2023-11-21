import javax.swing.*; // Import Swing library for GUI components
import java.awt.*; // Import AWT library for layout management
import java.awt.event.ActionEvent; // Import classes for handling actions
import java.awt.event.ActionListener; // Import classes for handling action events

public class Swing1 extends JFrame { // Define a class named Swing1 that extends JFrame

    // Declare static variables for text fields and JFrame
    static private JTextField textField1, textField2, textField3;
    static JFrame frame = new JFrame("Button and TextBox Example");

    public static void main(String[] args) { // Main method

        // Set up the frame
        frame.setSize(400, 200); // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation for the frame

        // Create components
        textField1 = new JTextField(10); // Create text field 1
        textField2 = new JTextField(10); // Create text field 2
        textField3 = new JTextField(10); // Create text field 3
        JButton calculateButton = new JButton("Calculate"); // Create a button with the label "Calculate"

        // Set up the layout using FlowLayout
        frame.setLayout(new FlowLayout()); // Set layout manager for the frame
        frame.add(new JLabel("Number 1: ")); // Add label and text field for Number 1
        frame.add(textField1);
        frame.add(new JLabel("Number 2: ")); // Add label and text field for Number 2
        frame.add(textField2);
        frame.add(new JLabel("Number 3: ")); // Add label and text field for Number 3
        frame.add(textField3);
        frame.add(calculateButton); // Add the "Calculate" button
        frame.setVisible(true); // Make the frame visible

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndShowResults(); // Call the method to calculate and show results
            }
        });
    }

    private static void calculateAndShowResults() { // Method to calculate and show results
        try {
            // Parse input values
            double num1 = Double.parseDouble(textField1.getText()); // Parse Number 1
            double num2 = Double.parseDouble(textField2.getText()); // Parse Number 2
            double num3 = Double.parseDouble(textField3.getText()); // Parse Number 3

            // Calculate sum, average, and largest
            double sum = num1 + num2 + num3;
            double average = sum / 3;
            double largest = Math.max(Math.max(num1, num2), num3);

            // Display results in a dialog box
            String message = "Sum: " + sum + "\nAverage: " + average + "\nLargest: " + largest;
            JOptionPane.showMessageDialog(frame, message, "Results", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            // Handle invalid input
            JOptionPane.showMessageDialog(frame, "Invalid input. Please enter valid floating-point numbers.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
