import java.sql.*;
import java.util.List;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeDAOImpl implements EmployeeDAO {


    @Override
    public Employee get(int id) throws SQLException {
        return null;

    }
//        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sophi\\Downloads\\build_comp.db");
//
//        Employee employee = null;
//
//        String sql = "SELECT id, EmployeeId, Name, DeptId FROM Employee WHERE id = ?";
//
//        PreparedStatement ps = con.prepareStatement(sql);
//
//        ps.setInt(1, id);
//
//        ResultSet rs = ps.executeQuery();
//
//        if (rs.next()) {
//            int old = rs.getInt("id");
//            int employeeId = rs.getInt("employeeId");
//            String Name = rs.getString("Name");
//            int deptId = rs.getInt("deptId");
//
//            employee = new Employee(id, employeeId, Name, deptId);
//        }
//
//        return employee;
//    }

    @Override
    public List<Employee> getAll() throws SQLException {
        return null;
    }

    @Override
    public int save(Employee employee) throws SQLException {
        return 0;
    }

    @Override
    public int insert(Employee employee) throws SQLException {
        return 0;
    }
//        Connection con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sophi\\Downloads\\build_comp.db");
//
//        String sql = "INSERT INTO Employee (id, employeeId, Name, deptId) VALUES (?, ?, ?, ?)";
//
//        PreparedStatement ps = con.prepareStatement(sql);
//
//        ps.setInt(1, employee.getId());
//        ps.setInt(2, employee.getEmployeeId());
//        ps.setString(3, employee.getName());
//        ps.setInt(4, employee.getDeptId());
//
//        int result = ps.executeUpdate();
//
//        return result;
//    }
    @Override
    public int update(Employee employee) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sophi\\Downloads\\build_comp.db");

        String sql = "UPDATE Employee set id = ?, employeeId = ?, Name = ?, deptId = ?  WHERE id = ?";

        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setInt(1,employee.getId());
        ps.setInt(2, employee.getEmployeeId());
        ps.setString(3, employee.getName());
        ps.setInt(4, employee.getDeptId());

        int result = ps.executeUpdate();

        return result;

    }

    @Override
    public int delete(Employee employee) throws SQLException {
        return 0;
    }
}
