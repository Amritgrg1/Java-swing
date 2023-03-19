import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world");

        // button add
        JButton button = new JButton("Click me");
        button.setBounds(100,100,100,50);
        frame.add(button);

        // button label
        JLabel label = new JLabel("click here");
        label.setBounds(100,50,100,50);
        frame.add(label);

        // checkbox
        JCheckBox checkBox = new JCheckBox("Male");
        checkBox.setBounds(100,150,100,50);
        frame.add(checkBox);

        //textbox
        JTextArea textArea = new JTextArea("comment here");
        textArea.setBounds(100,200,200,100);
        frame.add(textArea);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}