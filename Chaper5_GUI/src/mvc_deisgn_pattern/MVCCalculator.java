package mvc_deisgn_pattern;

import mvc_deisgn_pattern.controller.CalculatorController;
import mvc_deisgn_pattern.model.CalculatorModel;
import mvc_deisgn_pattern.view.CalculatorView;

public class MVCCalculator {
    public static void main(String[] args) {
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);
    }
}
