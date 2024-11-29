package jdbc3.repository;

import jdbc.JDBCConnector;
import jdbc3.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductRepository {
    public static ArrayList<Product> getList(String type, String searchWord){
        ArrayList<Product> arrList = new ArrayList<>();
        Connection con = JDBCConnector.getConnection();
        String sql = "select * from 제품 where "+type+" like ?";
        //문장객체
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);//여기서 클로즈 한다.
            pstmt.setString(1, "%"+searchWord+"%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setProNum(rs.getString("제품번호"));//제품번호 대신 숫자도 ㄱㄴ
                product.setProName(rs.getString("제품명"));//제품번호 대신 숫자도 ㄱㄴ
                product.setProStock(rs.getInt("재고량"));//제품번호 대신 숫자도 ㄱㄴ
                product.setProPrice(rs.getInt("단가"));//제품번호 대신 숫자도 ㄱㄴ
                product.setProNum(rs.getString("제조업체"));//제품번호 대신 숫자도 ㄱㄴ
                arrList.add(product);
            }
            rs.close();//리소스 수거
            con.close();//리소스 수거
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return arrList;
    }
}
