package tetris.components;

import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {

    public Menu(int height) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(135,height));
    }
}
