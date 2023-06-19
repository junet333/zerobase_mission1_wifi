package step.step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {


    /**
     * TODO: 2. 데이터베이스 연결 테스트
     */
    public static void main(String[] args) {

        test();


    }
    public static void test() {
        String url = "jdbc:mariadb://localhost:3306/wifi";
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

    }

}
