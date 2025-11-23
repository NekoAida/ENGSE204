package Lab1_14;
import java.util.Scanner;

public class Lab1_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Map Size(Rows,Cols)");
        int R = input.nextInt();
        int C = input.nextInt();

        char[][] map = new char[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = input.next().charAt(0);
            }
        }

        int targetR = input.nextInt();
        int targetC = input.nextInt();

        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
        } else {
            int mineCount = 0;

            for (int row = -1; row <= 1; row++) {
                for (int col = -1; col <= 1; col++) {
                    if (row == 0 && col == 0) continue;

                    int checkR = targetR + row;
                    int checkC = targetC + col;

                    if (checkR >= 0 && checkR < R && checkC >= 0 && checkC < C) {
                        if (map[checkR][checkC] == '*')  {
                            mineCount++;
                        }
                    }
                }
            }
            System.out.println(mineCount);
        }
    }
}
