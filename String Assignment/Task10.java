import java.util.Scanner;
public class Task10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.nextLine().charAt(0);

        System.out.print("Enter the new character: ");
        char newChar = scanner.nextLine().charAt(0);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == oldChar) {
                result.append(newChar);
            } else {
                result.append(ch);
            }
        }

        System.out.println("Resulting string: " + result.toString());

        scanner.close();
    }
}
