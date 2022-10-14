import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment10Question1 extends JFrame implements ActionListener {

    JLabel jLabel;
    JTextField jTextField;

    Assignment10Question1() {

        JFrame jFrame = new JFrame("Factorial");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Find factorial");
        jLabel = new JLabel("");
        jTextField = new JTextField(2);

        jButton.addActionListener(this);
        jPanel.setSize(500, 500);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        jPanel.add(jLabel);


        jFrame.add(jPanel);

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Assignment10Question1();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int n = Integer.parseInt(jTextField.getText());
        jLabel.setText(String.valueOf(factorial(n)));

    }

    public int factorial(int number) {
        int i, fact = 1;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
