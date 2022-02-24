package kr.odegaa.tictactoe;

import kr.odegaa.tictactoe.component.*;

public final class Launcher {
    public static void main(final String[] args) {
        final Game game =
                new Game(new DataPrinter(),
                        new ComputerMove(),
                        new UserMove(),
                        new WinnnerVerifier(),
                        new DrawVerifer()
                );

        game.play();

    }
}
