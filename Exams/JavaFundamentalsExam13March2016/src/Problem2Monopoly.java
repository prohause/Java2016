import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by proha on 16-Apr-16.
 */
public class Problem2Monopoly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();
        scanner.nextLine();

        List<char[]> maze = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            char[] singleLine = scanner.nextLine().toCharArray();

            if (i % 2 == 0) {
                maze.add(singleLine);
            } else {
                char[] reverseLine = new char[singleLine.length];
                for (int j = 0; j < reverseLine.length; j++) {
                    reverseLine[j] = singleLine[singleLine.length - j - 1];
                }
                maze.add(reverseLine);
            }

        }
        int gameTurn = 0;
        int hotels = 0;
        int money = 50;

        for (int i = 0; i < maze.size(); i++) {
            for (int j = 0; j < maze.get(i).length; j++) {
                int spent = 0;
                if (i % 2 == 0) {
                    spent = (i + 1) * (j + 1);
                } else {
                    spent = (i + 1) * (maze.get(i).length - j);
                }
                switch (maze.get(i)[j]) {
                    case 'H':
                        gameTurn++;
                        hotels++;
                        System.out.println("Bought a hotel for " + money + ". Total hotels: " + hotels + ".");
                        money = 0;
                        money += hotels * 10;
                        break;
                    case 'F':
                        gameTurn++;
                        money += hotels * 10;
                        break;
                    case 'J':
                        System.out.println("Gone to jail at turn " + gameTurn + ".");
                        gameTurn += 3;
                        money += hotels * 30;
                        break;
                    case 'S':
                        gameTurn++;
                        money += (hotels * 10);
                        if (money <= spent) {
                            spent = money;
                            money = 0;
                        } else {
                            money -= spent;
                        }

                        System.out.println("Spent " + spent + " money at the shop.");
                        ;
                        break;
                    default:
                        break;
                }

            }

        }
        System.out.println("Turns " + gameTurn);
        System.out.println("Money " + money);
    }
}
