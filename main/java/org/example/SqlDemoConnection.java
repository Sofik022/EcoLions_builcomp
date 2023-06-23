
import java.sql.*;



public class SqlDemoConnection {
    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        Employee employee = new Employee(1, 79, "Richard First", 89);
        int result = employeeDAO.update(employee);
        System.out.println(employee);
    }


    {

//        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//
//        Employee employee = new Employee(0, 11, "Jaroslav Sczest", 21);
//
//        int result = employeeDAO.insert(employee);
//
//        System.out.println(result);


//        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//
//        Employee employee;
//        employee = employeeDAO.get(2);
//        System.out.println(employee);
//
//    }
//
//
//    {
//        Connection connection = null;
//        ResultSet resultSet = null;
//        Statement statement = null;
//
//        try
//        {
//            Class.forName("org.sqlite.JDBC");
//            connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sophi\\Downloads\\build_comp.db");
//            statement = connection.createStatement();
//            resultSet = statement
//                    .executeQuery("SELECT Name FROM Employee");
//            while (resultSet.next())
//            {
//                System.out.println("Employee Name:"
//                        + resultSet.getString("Name"));
//            }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                resultSet.close();
//                statement.close();
//                connection.close();
//            } catch (Exception e) {
//                e.printStackTrace();
            }
        }