/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datacon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {
    private static final String URL = "jdbc:sqlserver://MAC1000\\KIEN:1433;databaseName=qlbangiay;encrypt=false";
    private static final String USER = "sa";
    private static final String PASSWORD = "12345";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Kết nối tới cơ sở dữ liệu
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null) {
                System.out.println("Kết nối thành công!");
            }
        } catch (SQLException e) {
            System.err.println("Kết nối thất bại: " + e.getMessage());
        } finally {
            // Đảm bảo đóng kết nối khi không sử dụng
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

