package tetris.components;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {
    private final int cellSize = 25;
    private final int columnNumber = 10;
    private final int rowNumber = 22;
    public Game() {
        setBackground(Color.PINK);
        setPreferredSize(new Dimension(cellSize * columnNumber,getHeight()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int row = 0; row < rowNumber; row++){
            for (int column = 0; column < columnNumber; column++) {
                g.drawRect(column * cellSize, row * cellSize, cellSize, cellSize);
            }
        }
    }

    public int getHeight() {
        return cellSize * rowNumber;
    }
}
