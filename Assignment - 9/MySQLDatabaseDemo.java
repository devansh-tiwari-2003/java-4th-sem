import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDatabaseDemo {
    static final String DB_URL = "jdbc:mysql://localhost:3306/java_demo";

    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM emp";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id  = rs.getInt("id");
                String name = rs.getString("name");
                int age  = rs.getInt("age");

                System.out.println(" ");
                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.print(", Age: " + age);
                System.out.println(" ");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch(SQLException se){
            se.printStackTrace();
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            try{
                if(stmt!=null)
                    stmt.close();
            } catch(SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
