package kr.odegaa.tictactoe.component;

import kr.odegaa.tictactoe.model.GameTable;

import java.util.Random;

public class Game {

    private final DataPrinter dataPrinter;

    private final ComputerMove computerMove;

    private final UserMove userMove;

    private final WinnnerVerifier winnerVerifier;

    private final DrawVerifer drawVerifer;


    public Game(final DataPrinter dataPrinter,
                final ComputerMove computerMove,
                final UserMove userMove,
                final WinnnerVerifier winnerVerifier,
                final DrawVerifer drawVerifer) {

        this.dataPrinter = dataPrinter;
        this.computerMove = computerMove;
        this.userMove = userMove;
        this.winnerVerifier = winnerVerifier;
        this.drawVerifer = drawVerifer;

    }

    public void play() {
        System.out.println("Игра Крестики-Нолики. Введите число от 1 до 9!");
        dataPrinter.printMappingTable();
        final GameTable gameTable = new GameTable();
        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
        }
        while (true) {
            userMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isUserWin(gameTable)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (drawVerifer.isDraw(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isComputerWin(gameTable)) {
                System.out.println("COMPUTER WIN!");
                break;
            }
            if (drawVerifer.isDraw(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
    }
}
