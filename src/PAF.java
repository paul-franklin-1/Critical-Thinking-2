import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;

public class PAF extends Frame implements ActionListener {
    String title;
    Button depButton;
    Button withButton;

    public PAF (String title) {
        super();
        Button depButton = new Button("Deposit");
        Button withButton = new Button("Withdrawal");
        depButton.addActionListener(this);
        withButton.addActionListener( this);
    }

    public static void main(String[] args) {
        PAF bankFrame = new PAF("Bank Transactions");
        bankFrame.setTitle("My Bank Account: Withdraw and Deposit");
        bankFrame.setSize(800, 100);
        bankFrame.setVisible(true);

        JPanel transactionPanel = new JPanel();
        transactionPanel.setBackground(null);
        transactionPanel.setBounds(0,100,350,700);
        bankFrame.add(transactionPanel);


    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
    }
    }


