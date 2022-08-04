package tetris.frame;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame() {
        setTitle("Tetris");
        setSize(new Dimension(400,595));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        PlaceHolder pH = new PlaceHolder();
        add(pH);
        addKeyListener(pH.getKeyHandler());
        setVisible(true);
    }


}
