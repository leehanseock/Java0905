package jdbc3.controller;

import jdbc.JDBCConnector;
import jdbc3.entity.Product;
import jdbc3.view.ProductView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

public class MainController {
    public static void main(String[] args) {
        ArrayList<Product> arrayList = getList();
        printView(arrayList);
    }
    public static void printView(ArrayList<Product> arrayList) {
        ProductView view = new ProductView();
        view.printHeader();
        view.printProduct(arrayList);
        view.printFooter();
    }

    public static ArrayList<Product> getList(){
        ArrayList<Product> arrducts = new ArrayList<>();
        Connection con = JDBCConnector.getConnection();
        String sql = "select * from 제품";
        //문장객체
        try {
            PreparedStatement pstnt = con.prepareStatement(sql);//여기서 클로즈 한다.
            ResultSet rs = pstnt.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setProNum(rs.getString("제품번호"));//제품번호 대신 숫자도 ㄱㄴ
                product.setProName(rs.getString("제품명"));//제품번호 대신 숫자도 ㄱㄴ
                product.setProStock(rs.getInt("재고량"));//제품번호 대신 숫자도 ㄱㄴ
                product.setProPrice(rs.getInt("단가"));//제품번호 대신 숫자도 ㄱㄴ
                product.setProNum(rs.getString("제조업체"));//제품번호 대신 숫자도 ㄱㄴ
                arrducts.add(product);
            }
            rs.close();//리소스 수거
            con.close();//리소스 수거
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return arrducts;
    }
}
