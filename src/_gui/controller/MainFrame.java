package _gui.controller;

import _gui.Main;
import _gui.view.OrderInfoView;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    public static final int FRAME_WIDTH = 1000;
    public static final int FRAME_HEIGHT = 500;
    public int frameX = 300;
    public int frameY = 200;


    public MainFrame() {
        super("검색프로그램");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        double sw = dimension.getWidth();
        double sh = dimension.getHeight();

        frameX = (int)((0.5)*(sw-FRAME_WIDTH));
        frameY = (int)((0.5)*(sh-FRAME_HEIGHT));

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView, "Center");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(frameX, frameY);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);

    }

    public static void main(String[] args) {
        new MainFrame();

    }
}