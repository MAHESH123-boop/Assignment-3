import java.util.Scanner;

public class Task7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String noSpaces = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ') {
                noSpaces += ch;
            }
        }

        System.out.println("String without spaces: " + noSpaces);

        scanner.close();
    }
}
