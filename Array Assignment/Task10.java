public class Task10 {

    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }

        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[uniqueCount++] = arr[i];
            }
        }

        int[] result = new int[uniqueCount];
        System.arraycopy(arr, 0, result, 0, uniqueCount);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArr = removeDuplicates(arr);

        System.out.print("Array with duplicates removed: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
        // Expected output: Array with duplicates removed: 1 2 3 4 5
    }
}