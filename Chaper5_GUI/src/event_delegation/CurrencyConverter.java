package event_delegation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverter extends JFrame implements ActionListener {
    static final Double NPR_TO_INR = 1.6d;
    static final Double NPR_TO_USD = 130d;
    JLabel enterLabel, amountINRLable, amountInUsdLabel;
    JTextField nprTextField, inrTextField, usdTextField;

    JButton convertButton;

    public CurrencyConverter() {
        setTitle("Currency Converter");
        enterLabel = new JLabel("Enter amount in NPR:");
        amountINRLable = new JLabel("Amount in INR");
        amountInUsdLabel = new JLabel("Amount in USD");

        nprTextField = new JTextField(50);
        inrTextField = new JTextField(50);
        usdTextField = new JTextField(50);

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        //layout
        setLayout(new FlowLayout());

        //adding component on frame
        add(enterLabel);
        add(nprTextField);
        add(amountINRLable);
        add(inrTextField);
        add(amountInUsdLabel);
        add(usdTextField);

        add(convertButton);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Double nprAmount = 0d;
        Double inrAmount = 0d;
        Double usdAmount = 0d;

        nprAmount = Double.parseDouble(nprTextField.getText());
        inrAmount = nprAmount / NPR_TO_INR;
        usdAmount = nprAmount / NPR_TO_USD;

        inrTextField.setText(inrAmount.toString());
        usdTextField.setText(usdAmount.toString());

    }

    public static void main(String args[]) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.setVisible(true);
        currencyConverter.setSize(200, 500);

    }
}
