import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ModelDisplay extends JFrame {

    private JTable table;
    private DefaultTableModel tableModel;

    public ModelDisplay(List<Model> models) {
        setTitle("Model Display");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create table model with columns
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Model Name");
        tableModel.addColumn("Model ID");

        // Populate table model with data
        for (Model model : models) {
            tableModel.addRow(new Object[]{model.getName(), model.getID()});
        }

        // Create JTable with the populated table model
        table = new JTable(tableModel);

        // Add table to a scroll pane to handle large data sets
        JScrollPane scrollPane = new JScrollPane(table);

        // Add scroll pane to the frame
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Sample list of models
        List<Model> models = List.of(
                new Model("Model 1", 1),
                new Model("Model 2", 2),
                new Model("Model 3", 3)
        );

        // Create and display the frame
        SwingUtilities.invokeLater(() -> new ModelDisplay(models));
    }
}

// Sample model class
class Model {
    private String name;
    private int ID;

    public Model(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
