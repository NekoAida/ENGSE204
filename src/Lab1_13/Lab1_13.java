package Lab1_13;
import java.util.Scanner;

public class Lab1_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("Enter cols: ");
        int cols = input.nextInt();

        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = input.nextInt();
            }
        }

        int onlineCount = 0;

        for (int i = 0; i <  rows; i++) {
            for (int j = 0; j < cols; j++)  {
                if (grid[i][j] == 1) {
                    onlineCount++;
                }
            }
        }

        System.out.print("Online: " + onlineCount);

    }
}
