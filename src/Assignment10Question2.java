import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment10Question2 extends JFrame implements ActionListener {


    JLabel jLabel;

    Assignment10Question2() {

        JFrame jFrame = new JFrame("Button");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        JButton jButton1 = new JButton("Good Morning");
        JButton jButton2 = new JButton("Hello");
        JButton jButton3 = new JButton("Welcome");

        jLabel = new JLabel("     ");

        jButton1.setActionCommand("btn1");
        jButton2.setActionCommand("btn2");
        jButton3.setActionCommand("btn3");
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);

        jPanel.setSize(500, 500);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jLabel);

//        jFrame.add(jLabel);
        jFrame.add(jPanel);

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Assignment10Question2();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        String res = "";

        if (s.equals("btn1")) {
            res = "Good morning";
        } else if (s.equals("btn2")) {
            res = "Hello";
        } else {
            res = "Welcome";
        }


        jLabel.setText(res);

    }

}
