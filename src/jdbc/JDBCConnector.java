package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {

    private static Connection con;

    //db 들어가기 위해 필요한 것
    //다른 서버 접속일 경우 localhost에 해당 서버의 ip를 넣는다. 그후 포트번호,sid를 넣어서 마무리
    private static final String URL ="jdbc:oracle:thin:@192.168.24.172:1521/xe";

    private static final String USER_NAME = "system";

    private static final String PASSWORD = "1234";

    public static Connection getConnection() {
        // JDBC Driver Lodding(OracleDriver 글래스의 객체 생성)

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("JDBC Driver 정상 로딩 성공~!");

            con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            System.out.println("Oracle DB와 연결 성공~!");

        } catch (ClassNotFoundException e) {
            System.out.println("Oracle JDBC Driver 파일을 찾지 못했습니다!!!");
        } catch (SQLException e) {
            System.out.println("Oracle DB와 연결이 되지 않았습니다!!!");
        }
        return con;
    }

}
