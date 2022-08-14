package BorderLayout.Basic1;

import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class TextPanel extends JPanel {
    TextArea textArea;
    public TextPanel(){
        textArea = new TextArea();
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(textArea),BorderLayout.CENTER);
    }
    public void addText(String text){
        textArea.append(text+"\n");
    }
}
