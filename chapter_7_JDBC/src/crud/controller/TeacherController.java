package crud.controller;

import crud.service.TeacherService;
import crud.view.TeacherView;
import crud.model.TeacherModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class TeacherController {
    private TeacherView view;
    private TeacherService service;

    public TeacherController(TeacherView view, TeacherService service) {
        this.view = view;
        this.service = service;

        this.view.addCalculateListener(new AddButtonListener());
    }

    class AddButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TeacherModel model = new TeacherModel();
            model.setTeacherId(view.getTchId());
            model.setTeacherName(view.getTchName());
            model.setTeacherAddress(view.getTchAdd());
            model.setTeacherPhone(view.getTchPhone());

            try {
                service.addTeacher(model);
                view.displayTeachers(service.getAllTeachers());
                view.displayMessage("Teacher information added successfully.");
            } catch (SQLException ex) {
                view.displayMessage("Error: " + ex.getMessage());
            }
        }
    }
}

