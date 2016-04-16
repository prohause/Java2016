import java.util.Scanner;

/**
 * Created by proha on 16-Apr-16.
 */
public class Problem1TinySporebat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int life = 5800;
        int money = 0;
        Boolean alive = true;

        String input = scanner.nextLine();

        while (!input.equals("Sporeggar") && life > 0) {
            char[] enemies = input.toCharArray();
            for (int i = 0; i < enemies.length - 1; i++) {
                if (enemies[i] == 'L') {
                    life += 200;
                } else {
                    life -= enemies[i];
                    if (life <= 0) {
                        alive = false;
                        break;
                    }
                }

            }
            if (alive) {
                money += Character.getNumericValue(enemies[enemies.length - 1]);
            }
            input = scanner.nextLine();

        }
        if (alive) {
            System.out.println("Health left: " + life);
            if (money >= 30) {
                System.out.println("Bought the sporebat. Glowcaps left: " + (money - 30));
            } else {
                System.out.println("Safe in Sporeggar, but another " + (30 - money) + " Glowcaps needed.");
            }
        } else {
            System.out.println("Died. Glowcaps: " + money);
        }

    }
}
