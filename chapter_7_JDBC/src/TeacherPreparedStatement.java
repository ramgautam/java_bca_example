import java.sql.*;

public class TeacherPreparedStatement {

    private static final String URL = "jdbc:mysql://localhost:3306/College";
    private static final String USER = "root";
    private static final String PASSWORD = "mysql";

    public void saveTeacher(Teacher teacher) {
        String sql = "INSERT INTO teacher (name, subject) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, teacher.getName());
            pstmt.setString(2, teacher.getSubject());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Teacher getTeacher(int id) {
        String sql = "SELECT * FROM teacher WHERE id = ?";
        Teacher teacher = null;

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                teacher = new Teacher();
                teacher.setId(rs.getInt("id"));
                teacher.setName(rs.getString("name"));
                teacher.setSubject(rs.getString("subject"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return teacher;
    }

    public static void main(String[] args) {
        TeacherPreparedStatement dao = new TeacherPreparedStatement();

        // Save a new teacher
        Teacher teacher = new Teacher();
        teacher.setName("John Doe");
        teacher.setSubject("Mathematics");
        dao.saveTeacher(teacher);

        // Retrieve a teacher
        Teacher retrievedTeacher = dao.getTeacher(1);
        if (retrievedTeacher != null) {
            System.out.println("ID: " + retrievedTeacher.getId());
            System.out.println("Name: " + retrievedTeacher.getName());
            System.out.println("Subject: " + retrievedTeacher.getSubject());
        } else {
            System.out.println("Teacher not found.");
        }
    }
}
