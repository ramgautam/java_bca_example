package crud.view;

import crud.model.TeacherModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;


public class TeacherView extends JFrame {
    private JTextField tchIdField = new JTextField(10);
    private JTextField tchNameField = new JTextField(10);
    private JTextField tchAddField = new JTextField(10);
    private JTextField tchPhoneField = new JTextField(10);
    private JButton addButton = new JButton("Add");

    private JTable table;
    private DefaultTableModel model;

    public TeacherView() {
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(new JLabel("Teacher ID:"));
        panel.add(tchIdField);
        panel.add(new JLabel("Teacher Name:"));
        panel.add(tchNameField);
        panel.add(new JLabel("Teacher Address:"));
        panel.add(tchAddField);
        panel.add(new JLabel("Teacher Phone:"));
        panel.add(tchPhoneField);
        panel.add(new JLabel());
        panel.add(addButton);

        //for displaying teacher
        model= new DefaultTableModel();
        table= new JTable(model);

        model.addColumn("Teacher ID");
        model.addColumn("Teacher Name");
        model.addColumn("Teacher Address");
        model.addColumn("Teacher Phone");

        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        this.add(panel);
        this.setTitle("Teacher Information");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void displayTeachers(List<TeacherModel> teachers) {
        model.setRowCount(0); // Clear existing rows
        for (TeacherModel teacher : teachers) {
            Object[] rowData = {
                    teacher.getTeacherId(),
                    teacher.getTeacherName(),
                    teacher.getTeacherAddress(),
                    teacher.getTeacherPhone()
            };
            model.addRow(rowData);
        }
    }

    public String getTchId() {
        return tchIdField.getText();
    }

    public String getTchName() {
        return tchNameField.getText();
    }

    public String getTchAdd() {
        return tchAddField.getText();
    }

    public String getTchPhone() {
        return tchPhoneField.getText();
    }

    public void addCalculateListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
}
