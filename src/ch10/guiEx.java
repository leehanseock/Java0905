package ch10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class guiEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("이벤트 처리 예제");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 기본 레이아웃 설정 (FlowLayout)
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("클릭하세요!");
        frame.add(button);  // 버튼을 JFrame에 추가

        JButton button2 = new JButton("클릭하세요!2");
        frame.add(button2);

        // 버튼 클릭 이벤트 처리
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "버튼이 클릭되었습니다!");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
