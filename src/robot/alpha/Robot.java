package robot.alpha;

public class Robot {

    public int x;
    public String name;

    public Robot(String name, int x) {
        this.name = name;
        this.x = x;
    }

    public void move(int n) {
        if (x + n < 100) {
            x = x + n;
        }
    }

    public void displayText() {
        System.out.println("Robot: " + name + " position: " + x);
    }
}