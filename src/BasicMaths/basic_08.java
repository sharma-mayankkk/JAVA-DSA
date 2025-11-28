package BasicMaths;
//Print all prime numbers in a range:

public class basic_08 {
    public static void primeNumbersInRange(int n){
        for(int i =2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int x){
        if(x==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        primeNumbersInRange(50);
    }
}
