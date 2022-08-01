package tetris.frame;

import tetris.components.Game;
import tetris.components.Menu;

import javax.swing.*;
import java.awt.*;

public class PlaceHolder extends JPanel {
    private final Game game = new Game();
    private final Menu menu = new Menu(game.getHeight());

    public PlaceHolder() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(Color.BLUE);
        add(game);
        add(menu);
    }
}
