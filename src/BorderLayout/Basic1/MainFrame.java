package BorderLayout.Basic1;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
  //  private JTextArea textArea;
   private TextPanel textPanel;
    private JButton button;
    public MainFrame(){
        super("Main Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(new Color(126, 234, 180));
        this.setBounds(450,200,500,500);
        this.setLayout(new BorderLayout());

        textPanel = new TextPanel();
      //  textArea.setBackground(new Color(126, 234, 180));
        button = new JButton("Click Me!!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   textArea.append("Button is clicked\n");
                textPanel.addText("Button clicked !!\n");
            }
        });
        this.add(textPanel,BorderLayout.CENTER);
        this.add(button,BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
