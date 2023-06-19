package step.step2;


import zerobase.wifi.service.SqliteConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseConnection extends SqliteConnection {

    /**
     * 데이터 베이스 연결 테스트
     * sqlite에서 현재 시간을 가져오는 쿼리를 실행해 본다.
     * select date(), time();
     */
    public static void test() {
        String url = "jdbc:mysql://localhost:3306/wifi";
        String id = "root";
        String pw = "zerobase";
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("Connection 객체 생성성공");
        }
        catch(ClassNotFoundException e) {
            System.out.println("드라이버 로드 실패");
        }
        catch(SQLException e) {
            System.out.println("Connection 객체 생성 실패");
        }
        finally {
            try {
                if(conn != null)
                    conn.close();
            }
            catch(SQLException e) {
                System.out.println("conn.close() 에러");
            }
        }


    }

}
