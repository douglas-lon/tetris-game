package tetris.frame;

import tetris.components.Game;
import tetris.components.Menu;
import tetris.handlers.GameKeyHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.function.Consumer;

public class PlaceHolder extends JPanel {
    private final Game game = new Game();

    public PlaceHolder() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(Color.BLUE);
        add(game);
        Menu menu = new Menu(game.getHeight());
        add(menu);
        tick();
    }


    private void tick() {
        new Thread(() -> {
            while (!game.hasLost()) {
                if (!game.hasReachedEnd()){
                    game.repaint();
                }

            }

        }).start();

    }

    public GameKeyHandler getKeyHandler() {
        return new GameKeyHandler(o -> {
            game.movementCallBack((Integer) o);
        });
    }

}
