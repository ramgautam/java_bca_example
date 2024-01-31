package mvc_deisgn_pattern.view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);

    public CalculatorView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }

   public void addCalculateListener(ActionListener listenerForCalcButton) {
        calculateButton.addActionListener(listenerForCalcButton);
    }

   public  void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}

