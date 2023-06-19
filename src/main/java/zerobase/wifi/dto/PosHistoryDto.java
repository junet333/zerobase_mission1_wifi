package zerobase.wifi.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import zerobase.wifi.model.PosHistoryModel;

public class PosHistoryDto {
    String url = "jdbc:mariadb://localhost:3306/wifi";
    String id = "root";
    String pw = "zerobase";
    Connection conn = null;
    PreparedStatement stat = null;

    public void insert(PosHistoryModel posHistoryModel){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("Connection 객체 생성성공");

            String sql = "INSERT INTO wifi_history(X_COR, Y_COR, FIND_DATE) VALUES (?, ?, NOW());";

            stat = conn.prepareStatement(sql);
            stat.setString(1, posHistoryModel.getX좌표());
            stat.setString(2, posHistoryModel.getY좌표());

            int affected = stat.executeUpdate();

            if (affected < 0) {
                System.out.println("저장 실패");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패");
        } catch (SQLException e) {
            System.out.println("Connection 객체 생성 실패");
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println("conn.close() 에러");
            }
        }
    }
}


