public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {1,43,2,33,67,92,45};
        int min = numbers[0];
        

        for (int i = 1; i < numbers.length; i++) {
               if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Smallest element of arr: " + min);
    
    }
}
