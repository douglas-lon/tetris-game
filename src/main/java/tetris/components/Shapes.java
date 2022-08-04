package tetris.components;

import java.util.Random;

public enum Shapes {
    I(new int[][]{{1,0},{1,0},{1,0},{1,0}}),
    O(new int[][]{{1,1},{1,1}}),
    T(new int[][]{{1,0},{1,1},{1,0}}),
    S(new int[][]{{1,0},{1,1},{0,1}}),
    Z(new int[][]{{0,1},{1,1},{1,0}}),
    J(new int[][]{{1,0},{1,0},{1,1}}),
    L(new int[][]{{0,1},{0,1},{1,1}});
    private final int[][] myArray;
    private final static Shapes[] VALUES = values();
    private final static Random randomizer = new Random();

    Shapes(int[][] ints) {
        this.myArray = ints;
    }

    public int[][] getValue() {
        return myArray;
    }

    public static Shapes getRandomShape() {
        return VALUES[randomizer.nextInt(VALUES.length)];
    }
}

