import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxExample extends JFrame {

    private JComboBox<String> comboBox;
    private JLabel label;

    public ComboBoxExample() {
        // Set up the JFrame
        super("ComboBox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Set up the layout using FlowLayout
        setLayout(new FlowLayout());

        // Create an array of items for the combo box
        String[] items = {"Option 1", "Option 2", "Option 3", "Option 4"};

        // Create a JComboBox and add items to it
        comboBox = new JComboBox<>(items);

        // Create a label to display the selected item
        label = new JLabel("Selected Item: ");

        // Add action listener to the combo box
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateLabel();
            }
        });

        // Add the combo box and label to the frame
        add(comboBox);
        add(label);

        // Set the frame to be visible
        setVisible(true);
    }

    private void updateLabel() {
        // Update the label with the selected item
        String selected = comboBox.getSelectedItem().toString();
        label.setText("Selected Item: " + selected);
    }

    public static void main(String[] args) {
        // Create an instance of the ComboBoxExample class
        new ComboBoxExample();
    }
}
