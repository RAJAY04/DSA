import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonExample extends JFrame {

    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JLabel resultLabel;

    public RadioButtonExample() {
        // Set up the JFrame
        super("Radio Button Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Set up the layout using GridLayout
        setLayout(new FlowLayout());

        // Create radio buttons and add them to a button group
        ButtonGroup genderGroup = new ButtonGroup();
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        // Create a label to display the selected gender
        resultLabel = new JLabel("Selected Gender: ");

        // Add action listener to both radio buttons
        ActionListener radioListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResultLabel();
            }
        };
        maleRadioButton.addActionListener(radioListener);
        femaleRadioButton.addActionListener(radioListener);

        // Add components to the frame
        add(maleRadioButton);
        add(femaleRadioButton);
        add(resultLabel);

        // Set the frame to be visible
        setVisible(true);
    }

    private void updateResultLabel() {
        // Update the label based on the selected radio button
        if (maleRadioButton.isSelected()) {
            resultLabel.setText("Selected Gender: Male");
        } else if (femaleRadioButton.isSelected()) {
            resultLabel.setText("Selected Gender: Female");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the RadioButtonExample class
        new RadioButtonExample();
    }
}
