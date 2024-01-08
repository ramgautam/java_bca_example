import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class RadioCheckboxApplet extends Applet implements ItemListener {
    Checkbox checkbox;
    CheckboxGroup radioGroup;
    String checkboxValue;
    String radioValue;

    public void init() {
        setLayout(new FlowLayout());

        checkbox = new Checkbox("Check me");
        checkbox.addItemListener(this);

        radioGroup = new CheckboxGroup();
        Checkbox radio1 = new Checkbox("Option 1", radioGroup, false);
        Checkbox radio2 = new Checkbox("Option 2", radioGroup, false);

        radio1.addItemListener(this);
        radio2.addItemListener(this);

        add(checkbox);
        add(radio1);
        add(radio2);
    }

    @Override
    public void itemStateChanged(ItemEvent event) {
        Object source = event.getItemSelectable();

        if (source == checkbox) {
            if (checkbox.getState()) {
                checkboxValue = "Checkbox checked";
            } else {
                checkboxValue = "Checkbox unchecked";
            }
        } else if (source instanceof Checkbox) {
            radioValue = ((Checkbox) source).getLabel();
        }

        // Call a method to pass the values to your Java code or perform any necessary action
        passValuesToCode();
    }

    private void passValuesToCode() {
        // Here you can use checkboxValue and radioValue as needed in your Java code
        System.out.println("Checkbox value: " + checkboxValue);
        System.out.println("Radio value: " + radioValue);
    }
}
