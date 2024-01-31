package mvc_deisgn_pattern.controller;

import mvc_deisgn_pattern.model.CalculatorModel;
import mvc_deisgn_pattern.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    public CalculatorView theView;
    public CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculateListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.add(firstNumber);
                theModel.subtract(secondNumber);

                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (NumberFormatException ex) {
                theView.displayErrorMessage("You need to enter 2 integers");
            }
        }
    }
}

