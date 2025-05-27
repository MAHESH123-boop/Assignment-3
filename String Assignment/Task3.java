public class Task3 {
     public static void main(String[] args) {
        String name ="mahesh";
        String reverse="";

        for (int i =name.length()-1; i>=0; i--) {
           reverse += name.charAt(i);
        }
        System.out.println("Print the reverse of string:" +reverse);
    }
    
}
