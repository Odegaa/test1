package kr.odegaa.tictactoe.component;

import kr.odegaa.tictactoe.model.Cell;
import kr.odegaa.tictactoe.model.GameTable;

public class DrawVerifer {

    public boolean isDraw(final GameTable gameTable) {
        final WinnnerVerifier winnnerVerifier = new WinnnerVerifier();
        if (!winnnerVerifier.isUserWin(gameTable) || !winnnerVerifier.isComputerWin(gameTable)) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (gameTable.isEmpty(new Cell(i, j))) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
