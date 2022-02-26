package kr.odegaa.tictactoe.component;

import kr.odegaa.tictactoe.model.Cell;
import kr.odegaa.tictactoe.model.GameTable;

import java.util.Random;

public class ComputerMove {

    public void make(final GameTable gameTable) {
        final Random random = new Random();
        while (true) {
            final int row = random.nextInt(3);
            final int col = random.nextInt(3);
            final Cell randomCell = new Cell(row, col);

            if (gameTable.isEmpty(randomCell)) {
                gameTable.setSign(randomCell, '0');
                return;
            }
        }
    }

}