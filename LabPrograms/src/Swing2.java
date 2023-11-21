import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;



public class Swing2 extends JFrame {



    private JComboBox<String> cityComboBox;

    private JTextField nameTextField, phoneTextField;

    private JRadioButton maleRadioButton, femaleRadioButton;

    private JCheckBox readingCheckBox, writingCheckBox, drawingCheckBox;



    public Swing2() {

        // Set up the frame

        setTitle("User Information Form");

        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);



        // Create components

        cityComboBox = new JComboBox<>(new String[]{"Select City", "New York", "London", "Paris", "Tokyo"});

        nameTextField = new JTextField(20);

        phoneTextField = new JTextField(20);

        maleRadioButton = new JRadioButton("Male");

        femaleRadioButton = new JRadioButton("Female");

        ButtonGroup genderGroup = new ButtonGroup();

        genderGroup.add(maleRadioButton);

        genderGroup.add(femaleRadioButton);



        readingCheckBox = new JCheckBox("Reading");

        writingCheckBox = new JCheckBox("Writing");

        drawingCheckBox = new JCheckBox("Drawing");



        JButton submitButton = new JButton("Submit");



        // Set up the layout

        setLayout(new GridLayout(7, 2));

        add(new JLabel("City:"));

        add(cityComboBox);

        add(new JLabel("Name:"));

        add(nameTextField);

        add(new JLabel("Phone Number:"));

        add(phoneTextField);

        add(new JLabel("Gender:"));

        add(maleRadioButton);

        add(new JLabel(""));

        add(femaleRadioButton);

        add(new JLabel("Hobbies:"));

        add(new JLabel(""));

        add(readingCheckBox);

        add(writingCheckBox);

        add(drawingCheckBox);

        add(submitButton);



        // Add action listener to the button

        submitButton.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                displayUserSelections();

            }

        });

    }



    private void displayUserSelections() {

        StringBuilder message = new StringBuilder("User Selections:\n");

        message.append("City: ").append(cityComboBox.getSelectedItem()).append("\n");

        message.append("Name: ").append(nameTextField.getText()).append("\n");

        message.append("Phone Number: ").append(phoneTextField.getText()).append("\n");



        if (maleRadioButton.isSelected()) {

            message.append("Gender: Male\n");

        } else if (femaleRadioButton.isSelected()) {

            message.append("Gender: Female\n");

        }



        message.append("Hobbies: ");

        if (readingCheckBox.isSelected()) {

            message.append("Reading ");

        }

        if (writingCheckBox.isSelected()) {

            message.append("Writing ");

        }

        if (drawingCheckBox.isSelected()) {

            message.append("Drawing");

        }



        // Display results in a dialog box

        JOptionPane.showMessageDialog(this, message.toString(), "User Selections", JOptionPane.INFORMATION_MESSAGE);

    }



    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override

            public void run() {

                new Swing2().setVisible(true);

            }

        });

    }

}