package jdbc3.controller;
import jdbc.JDBCConnector;
import jdbc3.entity.Product;
import jdbc3.repository.ProductRepository;
import jdbc3.service.ProductService;
import jdbc3.service.ProductServiceImpl;
import jdbc3.view.MenuView;
import jdbc3.view.ProductView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        //검색할 카테고리와 검색어 입력받을 스캐너 생성 (숫자열 전용 스캐너)
        Scanner s1 = new Scanner(System.in);
        //문자열 전용 스캐너 생성
        Scanner s2 = new Scanner(System.in);

        int menu = MenuView.printMenu(s1);
        ProductService productService = new ProductServiceImpl();

        switch (menu){
            case 1:
                productService.search(s1, s2);
                break;
            case 2:
                break;
            case 3:
                break;
        }


        s1.close();
        s2.close();
    }
}