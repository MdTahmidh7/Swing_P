package Frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(126, 234, 180));
        this.setBounds(450,200,500,500);
        this.setVisible(true);
    }
}
