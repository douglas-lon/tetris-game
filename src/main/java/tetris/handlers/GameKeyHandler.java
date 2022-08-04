package tetris.handlers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.function.Consumer;

public class GameKeyHandler implements KeyListener {

    private Consumer consumer;
    public GameKeyHandler(Consumer c) {
        consumer = c;
    }
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

        consumer.accept(keyEvent.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}