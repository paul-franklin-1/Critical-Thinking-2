import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PAF extends Frame implements WindowListener,ActionListener {
    //somecodecodecode;}



    public void actionPerformed(ActionEvent e) {
        //String text;
        //int numClicks;
        //text.setText("Button Clicked " + numClicks + " times");
    }
    public static void main(String[] args) {
        PAF bankFrame = new PAF();
        bankFrame.setTitle("My Bank Account:: Withdraw and Deposit");
        bankFrame.setSize(800, 800);
        bankFrame.setVisible(true);

        JPanel transactionPanel = new JPanel();
        transactionPanel.setBackground(null);
        transactionPanel.setBounds(0,100,350,700);
        bankFrame.add(transactionPanel);

        JButton depositBalance = new JButton("Make a Deposit");
        depositBalance.add(listener);
        JButton withdrawalBalance = new JButton("Make a Withdrawal");
        withdrawalBalance.addActionListener();
        transactionPanel.add(depositBalance);
        transactionPanel.add(withdrawalBalance);
    }
        }
