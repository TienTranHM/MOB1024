/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203;
import java.sql.*;
/**
 *
 * @author TienTHM_1
 */
public class NewConnect {
    private static Connection conn;
    
    public static Connection getMyConnection()
    {
        try {
            if (conn == null || conn.isClosed()) {
                String dbUser = "sa", dbPass = "tienthm",
                    dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=MOB1024;encrypt=true;trustServerCertificate=true;";

                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("Kết nối thành công");
            }
        } catch (SQLException e) {
             System.out.println("Lỗi kết nối: " + e);
        }
        
        return conn;
    }
    
    public static void main(String[] args) {
        getMyConnection();
    }
}
