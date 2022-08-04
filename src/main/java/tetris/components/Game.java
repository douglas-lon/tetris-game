package tetris.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.function.Consumer;


public class Game extends JPanel {
    private final int cellSize = 25;
    private final int columnNumber = 10;
    private final int rowNumber = 22;
    private float velocityY = 0.05f;
    private int velocityX = 0;
    private volatile boolean hasReachedEnd = true;
    private boolean hasLost = false;
    private Shapes currentShape;
    public Game() {
        setBackground(Color.PINK);
        setPreferredSize(new Dimension(cellSize * columnNumber,getHeight()));
    }

    private boolean drawAndMoveBlocks(Graphics g) {
        if (hasReachedEnd) {
            currentShape = Shapes.getRandomShape();
            hasReachedEnd = false;
            velocityY = 0.5f;
        }

        int[][] shapeArray = currentShape.getValue();

        for (int row = 0; row < shapeArray.length; row++) {
            for (int column = 0; column < shapeArray[row].length; column++){

                if (shapeArray[row][column] == 1)
                    g.fillRect((column + velocityX) * cellSize, (row + (int) velocityY) * cellSize,cellSize,cellSize);
            }
        }

        velocityY += 0.002f;
        return false;
    }

    public boolean hasReachedEnd() {
        return hasReachedEnd;
    }

    public boolean hasLost() {
        return hasLost;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int row = 0; row < rowNumber; row++){
            for (int column = 0; column < columnNumber; column++) {
                g.drawRect(column * cellSize, row * cellSize, cellSize, cellSize);
            }
        }

        hasReachedEnd = drawAndMoveBlocks(g);
    }

    public int getHeight() {
        return cellSize * rowNumber;
    }

    public void movementCallBack(int keyCode) {

        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                velocityX++;
                break;
            case KeyEvent.VK_LEFT:
                velocityX--;
                break;
            case KeyEvent.VK_DOWN:
                velocityY += 0.3f;
                break;
        }
    }


}


