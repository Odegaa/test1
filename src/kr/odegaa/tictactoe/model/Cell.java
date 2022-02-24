package kr.odegaa.tictactoe.model;

public class Cell {

    private final int row; //   ИНДЕКС СТРОКА

    private final int col; //   ИНДЕКС СТОЛБЦА

    public Cell(final int row, final int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "row = " + row +
                ", col = " + col +
                '}';
    }
}
