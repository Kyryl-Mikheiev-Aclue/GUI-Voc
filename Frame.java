import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class Frame {
    
    private JFrame frame;
    private JPanel contentPane;
    private JPanel navigation;
    private JButton plusButton;
    private Color BLUE;
    private JPanel middlePanel;
    
    public Frame() {
        BLUE = new Color(31, 38, 59);

        plusButton = new JButton("+");


        JTextArea textArea = new JTextArea();
        textArea.setSize(100, 20);
        textArea.setLayout(null);
        textArea.setBackground(Color.YELLOW);

        middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(3, 1));
        middlePanel.setBackground(Color.GREEN);
        JPanel panel1 = new JPanel();
        panel1.setBackground(BLUE);
        JPanel panel2 = new JPanel();
        panel2.setBackground(BLUE);
        middlePanel.add(panel1);
        middlePanel.add(textArea);
        //middlePanel.add(panel2);

        navigation = new JPanel();
        navigation.setLayout(new GridLayout(0, 3));
        navigation.setBackground(Color.RED);
        navigation.add(plusButton);
        navigation.add(middlePanel);

        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(2, 1));
        contentPane.setSize(1000, 700);
        contentPane.setBackground(BLUE);
        contentPane.add(navigation);

        frame = new JFrame();
        // frame.setLayout(null);
        frame.setSize(1300, 900);
        // frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setLocationRelativeTo(null);
        frame.add(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }



}
