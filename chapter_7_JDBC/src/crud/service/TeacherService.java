package crud.service;

import crud.model.TeacherModel;
import crud.util.DatabaseHelper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<TeacherModel> getAllTeachers() throws SQLException {
        try {
            // Connect to the database
            Connection conn = new DatabaseHelper().getConnection();
            // Execute a query to fetch teacher details
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM teachers");
            List<TeacherModel> teacherModelList = new ArrayList<>();

            // Populate the table with fetched data
            while (rs.next()) {
                TeacherModel model = new TeacherModel();

                model.setTeacherId(rs.getString("teacher_id"));
                model.setTeacherId(rs.getString("teacher_name"));
                model.setTeacherId(rs.getString("teacher_address"));
                model.setTeacherId(rs.getString("teacher_phone"));
                teacherModelList.add(model);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            throw ex;
        }
        return null;
    }
}
