import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {

    private JTextField textField1, textField2, textField3;
    private JButton calculateButton;

    public SimpleCalculator() {
        // Set up the frame
        super("Simple Calculator");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        // Create components
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);
        calculateButton = new JButton("Calculate");

        // Set up the layout using GridLayout

        // Add labels and text fields manually
        add(new JLabel("Number 1: "));
        add(textField1);
        add(new JLabel("Number 2: "));
        add(textField2);
        add(new JLabel("Number 3: "));
        add(textField3);
        add(new JLabel()); // Empty label for spacing
        add(calculateButton);

        // Add action listener to the button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateAndShowResults();
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    private void calculateAndShowResults() {
        try {
            // Parse input values
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double num3 = Double.parseDouble(textField3.getText());

            // Calculate sum, average, and largest
            double sum = num1 + num2 + num3;
            double average = sum / 3;
            double largest = Math.max(Math.max(num1, num2), num3);

            // Display results in a dialog box
            String message = "Sum: " + sum + "\nAverage: " + average + "\nLargest: " + largest;
            JOptionPane.showMessageDialog(this, message, "Results", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            // Handle invalid input
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid floating-point numbers.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
