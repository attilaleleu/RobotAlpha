// A simple application that creates a robot class moving(left or right) on a X axis

package robot.menu;

import robot.alpha.Robot;

import java.util.Scanner;

public class RobotMenu {

    Robot r1 = new Robot("Aplha", 10);

    void menu() {
        Scanner userInput = new Scanner(System.in);
        int i;

        do {
            System.out.println("Choose option ");
            System.out.println("1 move left");
            System.out.println("2 move right");
            System.out.println("3 exit");
            i = userInput.nextInt();

            switch (i) {
                case 1:
                    r1.move(1);
                    break;
                case 2:
                    r1.move(-1);
                    break;
                default:
                    System.out.println("");
            }
            if (i > 3) {
                System.out.println("Unknown command");
                System.out.println("");
            }
            r1.displayText();

        } while (i != 3);
    }

    public static void main(String[] args) {
        RobotMenu menuObject = new RobotMenu();
        menuObject.menu();
    }
}