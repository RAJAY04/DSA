import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The main class representing the user information form
public class UserInformationForm extends JFrame {

    // Declare instance variables for GUI components
    private JComboBox<String> cityComboBox;
    private JTextField nameTextField, phoneTextField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JCheckBox readingCheckBox, writingCheckBox, drawingCheckBox;
    private JButton submitButton;  // Declare submitButton as an instance variable

    // Constructor for initializing the form
    public UserInformationForm() {
        initializeFrame();
        createComponents();
        addComponentsToLayout();
        addActionListeners();
    }

    // Method to set up the basic frame properties
    private void initializeFrame() {
        setTitle("User Information Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // Method to create GUI components
    private void createComponents() {
        // Create JComboBox for cities with initial options
        cityComboBox = new JComboBox<>(new String[]{"Select City", "New York", "London", "Paris", "Tokyo"});

        // Create JTextField for entering the name
        nameTextField = new JTextField(20);

        // Create JTextField for entering the phone number
        phoneTextField = new JTextField(20);

        // Create JRadioButtons for gender with a ButtonGroup
        maleRadioButton = new JRadioButton("Male");
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        // Create JCheckBoxes for hobbies
        readingCheckBox = new JCheckBox("Reading");
        writingCheckBox = new JCheckBox("Writing");
        drawingCheckBox = new JCheckBox("Drawing");

        // Create a JButton for submitting the form
        submitButton = new JButton("Submit");  // Initialize submitButton
    }

    // Method to arrange GUI components in a GridLayout
    private void addComponentsToLayout() {
        setLayout(new GridLayout(7, 2));
        // Add labels and corresponding components to the layout
        addLabelAndComponent("City:", cityComboBox);
        addLabelAndComponent("Name:", nameTextField);
        addLabelAndComponent("Phone Number:", phoneTextField);
        addLabelAndComponent("Gender:", maleRadioButton);
        addEmptyLabel();
        addLabelAndComponent("", femaleRadioButton);
        addLabelAndComponent("Hobbies:", readingCheckBox);
        addEmptyLabel();
        addLabelAndComponent("", writingCheckBox);
        addLabelAndComponent("", drawingCheckBox);
        addLabelAndComponent("", submitButton);  // Add submitButton to the layout
    }

    // Method to add an ActionListener to the submitButton
    private void addActionListeners() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayUserSelections();
            }
        });
    }

    // Method to display the user selections in a dialog box
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

    // Helper method to add a label and its corresponding component to the layout
    private void addLabelAndComponent(String label, JComponent component) {
        add(new JLabel(label));
        add(component);
    }

    // Helper method to add an empty label to the layout for formatting
    private void addEmptyLabel() {
        add(new JLabel(""));
    }

    // Main method to start the Swing application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create an instance of the form and make it visible
                new UserInformationForm().setVisible(true);
            }
        });
    }
}
