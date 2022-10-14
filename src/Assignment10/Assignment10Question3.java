package Assignment10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment10Question3 extends JFrame implements ActionListener {

    JLabel jLabel;
    ImageIcon imageIcon;

    Assignment10Question3() {

        JFrame jFrame = new JFrame("Button");
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.setSize(500, 500);
        JButton jButton1 = new JButton("India");
        jButton1.setBounds(100, 100, 150, 20);
        JButton jButton2 = new JButton("USA");
        jButton2.setBounds(100, 100, 150, 20);
        JButton jButton3 = new JButton("UK");
        jButton3.setBounds(100, 100, 150, 20);

        jLabel = new JLabel();

        jButton1.setActionCommand("india");
        jButton2.setActionCommand("usa");
        jButton3.setActionCommand("uk");
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);

        jPanel.setSize(500, 500);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jLabel);

        jFrame.add(jPanel);

        jFrame.pack();
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Assignment10Question3();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String s = e.getActionCommand();

        if (s.equals("india")) {
//            System.out.println("india");
            imageIcon = new ImageIcon("D:\\Code\\JavaAssignment\\src\\Assignment10\\indiaflag.png");
        } else if (s.equals("usa")) {
//            System.out.println("usa");
            imageIcon = new ImageIcon("D:\\Code\\JavaAssignment\\src\\Assignment10\\usaflag.png");
        } else {
//            System.out.println("uk");
            imageIcon = new ImageIcon("D:\\Code\\JavaAssignment\\src\\Assignment10\\ukflag.png");
        }

        jLabel.setIcon(imageIcon);

    }

}
