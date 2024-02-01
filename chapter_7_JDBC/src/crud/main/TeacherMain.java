package crud.main;

import crud.controller.TeacherController;
import crud.model.TeacherModel;
import crud.service.TeacherService;
import crud.view.TeacherView;

public class TeacherMain {

    public static void main(String[] args) {
        TeacherView view = new TeacherView();
        TeacherService service = new TeacherService();
        TeacherController controller = new TeacherController(view, service);
        view.setVisible(true);
    }
}
