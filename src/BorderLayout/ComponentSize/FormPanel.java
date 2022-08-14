package BorderLayout.ComponentSize;

import javax.swing.*;
import java.awt.*;

public class FormPanel extends JPanel {
    public FormPanel(){
        Dimension dimension = getPreferredSize();
        dimension.width = 30;
        this.setPreferredSize(dimension);
        System.out.println(dimension);
    }
}
