package BorderLayout.Basic1;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
   private TextPanel textPanel;
    private ToolBar toolBar;
    public MainFrame(){
        super("Main Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(new Color(126, 234, 180));
        this.setBounds(430,200,600,600);
        this.setLayout(new BorderLayout());

        textPanel = new TextPanel();
        toolBar = new ToolBar();

        toolBar.setTextListener(new TextListener() {
            @Override
            public void textEmitted(String string) {
               textPanel.addText(string);
            }
        });

        this.add(textPanel,BorderLayout.CENTER);
        this.add(toolBar,BorderLayout.NORTH);
        this.setVisible(true);
    }
}
