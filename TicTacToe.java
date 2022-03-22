import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("---------");
        String[][] cellArray = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cellArray[i][j] = " ";
            }
        }
        boolean FLAG = false; int count = 1;
        do {
            boolean flag = false;
            do {
                System.out.println("Enter the coordinates");
                try {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    if (a > 3 || b > 3) {
                        System.out.println("Coordinates shoulld be from 1 to 3!");
                        continue;
                    }
                    if (!(cellArray[a - 1][b - 1].equals(" "))) {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }
                    if(count % 2 != 0) {
                        cellArray[a - 1][b - 1] = "X";
                        flag = true;
                        count++;
                    } else {
                        cellArray[a - 1][b - 1] = "O";
                        flag = true;
                        count++;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("You should enter numbers!");
                }
            } while (!flag);
            System.out.println("---------");
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(cellArray[i][j] + " ");
                }
                System.out.println("|");
            }
            System.out.println("---------");
            String row1 = cellArray[0][0] + cellArray[0][1] + cellArray[0][2];
            String row2 = cellArray[1][0] + cellArray[1][1] + cellArray[1][2];
            String row3 = cellArray[2][0] + cellArray[2][1] + cellArray[2][2];
            String column1 = cellArray[0][0] + cellArray[1][0] + cellArray[2][0];
            String column2 = cellArray[0][1] + cellArray[1][1] + cellArray[2][1];
            String column3 = cellArray[0][2] + cellArray[1][2] + cellArray[2][2];
            String diagonal1 = cellArray[0][0] + cellArray[1][1] + cellArray[2][2];
            String diagonal2 = cellArray[0][2] + cellArray[1][1] + cellArray[2][0];
            String X = "XXX";
            String O = "OOO";
            int xWins = 0, oWins = 0;
            if (row1.equals(X) || row2.equals(X) || row3.equals(X) || column1.equals(X) || column2.equals(X) || column3.equals(X) || diagonal1.equals(X) || diagonal2.equals(X)) {
                xWins = 1;
            }
            if (row1.equals(O) || row2.equals(O) || row3.equals(O) || column1.equals(O) || column2.equals(O) || column3.equals(O) || diagonal1.equals(O) || diagonal2.equals(O)) {
                oWins = 1;
            }
            if (xWins == 1) {
                System.out.println("X wins");
                FLAG = true;
            }
            if (oWins == 1) {
                System.out.println("O wins");
                FLAG = true;
            }
        }while (!FLAG);
    }
}
