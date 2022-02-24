package kr.odegaa.tictactoe.component;

import kr.odegaa.tictactoe.model.Cell;
import kr.odegaa.tictactoe.model.GameTable;

public class DataPrinter {
    public void printMappingTable() {

        System.out.println("-------------");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("-------------");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("-------------");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("-------------");


    }

    public void printGameTable(final GameTable gameTable) {

//        System.out.println("-------------");
//        System.out.println("| " +
//                gameTable.getSign(new Cell(0, 0)) + "  | " +
//                gameTable.getSign(new Cell(0, 1)) + "  | " +
//                gameTable.getSign(new Cell(0, 2)) + " |");
//        System.out.println("-------------");
//        System.out.println("| " +
//                gameTable.getSign(new Cell(1, 0)) + " | " +
//                gameTable.getSign(new Cell(1, 1)) + " | " +
//                gameTable.getSign(new Cell(1, 2)) + " |");
//        System.out.println("-------------");
//        System.out.println("| " +
//                gameTable.getSign(new Cell(2, 0)) + " | " +
//                gameTable.getSign(new Cell(2, 1)) + " | " +
//                gameTable.getSign(new Cell(2, 2)) + " |");
//        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable.getSign(new Cell(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");

    }
}
