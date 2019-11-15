import java.sql.*;
import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.OracleConnection;

public static void main(String args[]) throws SQLException {
    Class.forName("oracle/jdbc.driver.OracleDriver");

    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:rhiannaso/5543541@cs174a.cs.ucsb.edu:1521/orcl");
}