import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to name your Critter?");
        String name = scan.nextLine();
        Critter bob = new Critter(name);
        Scanner scanner = new Scanner(System.in);
        while (bob.isAlive()) {
            System.out.println("What would you like " + bob.getName() + " to do?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                bob.feed();
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                bob.sleep();
            }
        }
        System.out.println("Critter has died.");
        scanner.close();
    }
}
