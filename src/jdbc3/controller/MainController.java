package jdbc3.controller;

import jdbc.JDBCConnector;
import jdbc3.entity.Product;
import jdbc3.repository.ProductRepository;
import jdbc3.view.ProductView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

public class MainController {
    public static void main(String[] args) {
        ArrayList<Product> arrayList = ProductRepository.getList();
        ProductView.printView(arrayList);
    }
}