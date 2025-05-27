import java.util.Scanner;
public class Task8 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0 ; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int key = scanner.nextInt();

        boolean found = false;
        for (int num : array) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + key + " is found in the array.");
        } else {
            System.out.println("Element " + key + " is not found in the array.");
        }
         scanner.close();
    }
    }
    

