import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment10Question4 extends JFrame implements ActionListener {

    JLabel jLabel;
    JCheckBox cb1, cb2, cb3;
    JButton buttonBuy;

    Assignment10Question4() {

        jLabel = new JLabel("Shopping");
        jLabel.setBounds(50, 50, 300, 20);

        cb1 = new JCheckBox("Tshirt: Rs.600");
        cb1.setBounds(100, 100, 150, 20);
        cb2 = new JCheckBox("Shirt: Rs.800");
        cb2.setBounds(100, 150, 150, 20);
        cb3 = new JCheckBox("Jeans: 1000");
        cb3.setBounds(100, 200, 150, 20);

        buttonBuy = new JButton("Order");
        buttonBuy.setBounds(100, 250, 80, 30);
        buttonBuy.addActionListener(this);

        add(jLabel);
        add(cb1);
        add(cb2);
        add(cb3);
        add(buttonBuy);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Assignment10Question4();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        float amount = 0;
        String msg = "";
        if (cb1.isSelected()) {
            amount += 600;
            msg = "Tshirt: 600\n";
        }
        if (cb2.isSelected()) {
            amount += 800;
            msg += "Shirt: 800\n";
        }
        if (cb3.isSelected()) {
            amount += 1000;
            msg += "Jeans: 1000\n";
        }
        msg += "-----------------\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + amount);

    }

}
