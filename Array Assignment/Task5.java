public class Task5 {
    public static void main(String[] args) {
        int [] num={1,2,3,4,5,6,7,8};
        int even=0;
        int odd=0;

        for(int number:num){
            if(number%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even numbers are:"+even);
        System.out.println("Odd numbers are:"+odd);
    }
    
}
