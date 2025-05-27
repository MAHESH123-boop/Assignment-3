import java.util.Arrays;;
public class Task7 {
    public static void main(String[] args) {
        int[] arr={1,32,43,23,65,12,7};
         
        Arrays.sort(arr);

        System.out.println("Sorted array of ascending order:");
        for(int num:arr){
            System.out.println(num+"");
        }
    }
    
}
