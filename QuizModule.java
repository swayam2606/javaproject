import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class project extends JFrame implements ActionListener {
    // declare variables
    JLabel questionLabel;
    JRadioButton option1, option2, option3, option4;
    JButton submitButton;
    int score = 0;

    public project() {
        // set up the JFrame
        super("Quiz Module");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        getContentPane().setBackground(Color.CYAN);
        setLocationRelativeTo(null);
        
        setLayout(new GridLayout(6, 1));
        setVisible(true);

        // create the question label and add it to the JFrame
        questionLabel = new JLabel("What is the capital of France?");
        add(questionLabel);

        // create the radio buttons and add them to the JFrame
        option1 = new JRadioButton("London");
        option2 = new JRadioButton("Berlin");
        option3 = new JRadioButton("Paris");
        option4 = new JRadioButton("Madrid");
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);
        add(option1);
        add(option2);
        add(option3);
        add(option4);

        // create the submit button and add it to the JFrame
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        // set the JFrame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // check the user's answer and update the score
        if (option3.isSelected()) {
            score++;
        }

        // show the correct answer
        JOptionPane.showMessageDialog(null, "The correct answer is Paris.");

        // show the correct answer and the score
        JOptionPane.showMessageDialog(null, "\nYour score is " + score + "/1.");

        // exit the program
        System.exit(0);
    }

    public static void main(String[] args) {
        new project();
    }
}
