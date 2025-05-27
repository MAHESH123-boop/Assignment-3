public class Task1{
    public static void main(String[] args) {
        int arr[]={1,21,5,34};
        int largest= arr[0];
        //System.out.println(arr.length);

        for(int i=1;i<arr.length; i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
        }
         System.out.println("Largext Element of array:" +largest);
    }
}