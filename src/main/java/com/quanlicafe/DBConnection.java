package com.quanlicafe;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    private static Connection connection;

    // Phương thức để lấy kết nối cơ sở dữ liệu
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                // Đọc thông tin cấu hình từ file db.properties
                Properties props = new Properties();
                try (FileInputStream fis = new FileInputStream("db.properties")) {
                    props.load(fis);
                }

                // Lấy thông tin kết nối từ file cấu hình
                String url = props.getProperty("db.url");
                String user = props.getProperty("db.user");  
                String password = props.getProperty("db.password"); 
                // Kết nối cơ sở dữ liệu
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Kết nối thành công!");
            } catch (Exception e) {
                e.printStackTrace();
                throw new SQLException("Loi ket noi CSDL!");
            }
        }
        return connection;
    }
}