package BasicMaths;
//Check if a number is prime or not:
import java.util.Scanner;
public class basic_02 {
    public static boolean isPrime(int n){
        //corner case:
        if(n == 2){
            return true;
        }
        for(int i =2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}
