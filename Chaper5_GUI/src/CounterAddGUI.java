import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterAddGUI extends JFrame implements ActionListener {
    JLabel counterLabel;
    JTextField counterTextField;
    JButton upButton,downButton,resetButton;

    public CounterAddGUI(){
        counterLabel= new JLabel("Counter");
        counterTextField= new JTextField("5");
        counterTextField.setSize(50,20);
        upButton= new JButton("Up");
        downButton= new JButton("Down");
        resetButton= new JButton("Reset");
        //setting corresponding layout the frame
        setLayout(new FlowLayout());
        //adding component into the frame
        add(counterLabel);
        add(counterTextField);
        add(upButton);
        add(downButton);
        add(resetButton);

        //register to event
        upButton.addActionListener(this);
        downButton.addActionListener(this);
        resetButton.addActionListener(this);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        Integer counterNumber=counterNumber= Integer.parseInt(counterTextField.getText());
        if (e.getSource() == upButton) {
            JOptionPane.showMessageDialog(this, "upButton pressed");
            counterNumber++;
            counterTextField.setText(counterNumber.toString());

        }
        if (e.getSource() == downButton) {
            JOptionPane.showMessageDialog(this, "downButton pressed");
             counterNumber--;
            counterTextField.setText(counterNumber.toString());


        }
        if (e.getSource() == resetButton) {
            JOptionPane.showMessageDialog(this, "resetButton pressed");
            counterNumber=0;
            counterTextField.setText(counterNumber.toString());

        }

    }

    public static  void main(String args[]){
       CounterAddGUI counterAddGUI= new CounterAddGUI();
       counterAddGUI.setVisible(true);
       counterAddGUI.setSize(200,200);


    }
}
