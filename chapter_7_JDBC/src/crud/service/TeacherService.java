package crud.service;

import crud.model.TeacherModel;
import crud.util.DatabaseHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherService {

    public void addTeacher(TeacherModel teacherModel) throws SQLException {
        try {
            Connection conn = new DatabaseHelper().getConnection();
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO Teacher (TchId, TchName, TchAdd, TchPhone) VALUES " +
                    "('" + teacherModel.getTeacherId() + "', '" + teacherModel.getTeacherName()
                    + "', '" + teacherModel.getTeacherAddress() + "', '" + teacherModel.getTeacherPhone() + "')";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            throw ex;
        }
    }
}
