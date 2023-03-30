import javax.swing.*;

public class Bin2Dec extends JFrame{

    private JFrame frame = new JFrame("Binary to Decimal Converter");
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("Enter a binary number: ");
    private JTextField textField = new JTextField(20);
    private JButton button = new JButton("Convert");
    private JLabel label2 = new JLabel("The decimal value for binary number ");


    public static void main(String[] args) {
        Bin2Dec bin2Dec = new Bin2Dec();
        bin2Dec.start();
    }

    private void start() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.add(panel);
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(label2);

        while(true) {
            button.addActionListener(e -> {
                String binaryString = textField.getText();
                int decimalValue = bin2Dec(binaryString);
                if(decimalValue == -1)
                    label2.setText("Thats not a binary number");
                else
                    label2.setText("The decimal value for binary number " + binaryString + " is " + decimalValue);
            });
        }
    }

    private int bin2Dec(String binaryString) {
        int decimalValue = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
                return -1;
            }
            char binaryChar = binaryString.charAt(i);
            decimalValue = decimalValue * 2 + binaryChar - '0';
        }
        return decimalValue;
    }
    
}