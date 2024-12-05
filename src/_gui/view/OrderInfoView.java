package _gui.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class OrderInfoView extends JPanel{
    JPanel panN = new JPanel(new GridLayout(2,1));
    JPanel panC = new JPanel();

    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();
    JButton btnSearch = new JButton("검색");

    JTextField tfSearch = new JTextField(20);

    DefaultTableModel tableModel = new DefaultTableModel();
    JTable table;

    String[] header = {"주문번호","주문고객","주문제품","수량","배송지","주문일자"};



    public OrderInfoView(){
        setLayout(new BorderLayout());//BorderLayout으로 변경

        //포함시키기
        panN.add(pan1);
        panN.add(pan2);

        add(panN, BorderLayout.NORTH);
        add(panC, BorderLayout.CENTER);

        addPan1();
        addPan2();

    }

    public void addPan1(){
        JLabel lblTiltle = new JLabel("검색 프로그램");
        pan1.add(lblTiltle);
    }

    public void addPan2(){
        JLabel lblSearch = new JLabel("검색어:");
        pan2.add(lblSearch);
        pan2.add(tfSearch);
        pan2.add(btnSearch);
    }

    public void addTable(){
        tableModel = new DefaultTableModel(header,15);
        table = new JTable(tableModel);

    }
}