import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PAF extends Frame implements ActionListener {
    String title;

    public PAF (String title) {
        this.title = title;
        Button depButton = new Button("Deposit");
        Button withButton = new Button("Withdrawal");
        depButton.addActionListener(this);
        withButton.addActionListener(this);
    }



    //public void actionPerformed(ActionEvent e) {
        //String text;
        //int numClicks;
        //text.setText("Button Clicked " + numClicks + " times");
    //}
    public static void main(String[] args) {
        PAF bankFrame = new PAF("bankTransactions");
        bankFrame.setTitle("My Bank Account: Withdraw and Deposit");
        bankFrame.setSize(800, 800);
        bankFrame.setVisible(true);

        JPanel transactionPanel = new JPanel();
        transactionPanel.setBackground(null);
        transactionPanel.setBounds(0,100,350,700);
        bankFrame.add(transactionPanel);


    }}

