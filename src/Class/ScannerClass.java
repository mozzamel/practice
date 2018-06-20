package Class;
import java.sql.*;


public class ScannerClass {
    private static final  String URL = "jdbc:mysql://localhost:3306/pntJedis";
    private static final String USER ="root";
    private static final String PASSWORD ="root";
    public static void main(String[] args) {

        //3. process the result set
        try {
            //1. get a connection with database;
            Connection myConn = DriverManager.getConnection(URL,USER,PASSWORD);
            //create a statement
            Statement mystmt =myConn.createStatement();
            //execute sql query
            ResultSet myRs = mystmt.executeQuery("SELECT * FROM pntJedis");
            //2. execute process the result set
            while (myRs.next()){
                System.out.println("ID #"+ " "+myRs.getString("employeeId")+ " "+myRs.getString("employeeName") + " " +myRs.getString("employeeDOB"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
