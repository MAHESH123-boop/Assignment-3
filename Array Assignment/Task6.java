public class Task6 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int[] newArray = new int[arr.length];

        for(int i=0; i<arr.length;i++){
            newArray[i]=arr[i];
        }
        System.out.println("Copied Array:");
        for(int num:newArray){
            System.out.println(num+"");
        }
    }
    
}
