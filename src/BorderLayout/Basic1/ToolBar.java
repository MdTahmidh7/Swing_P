package BorderLayout.Basic1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JPanel implements ActionListener {
    private JButton helloButton,goodbyeButton;
   private TextListener textListener;
    public ToolBar(){
        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("GoodBye");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(goodbyeButton);

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);
    }

    public void setTextListener(TextListener textListener){
        this.textListener=textListener;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        if (clickedButton.equals(helloButton)){
            //textPanel.addText("Hello\n");
            textListener.textEmitted("Hello");
        } else if (clickedButton.equals(goodbyeButton)) {
            textListener.textEmitted("GoodBye");
           // textPanel.addText("GoodBye\n");
        }
    }
}
