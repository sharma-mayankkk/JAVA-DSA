package BasicMaths;
//Print all divisor:

public class basic_07 {
    public static void allDivisors(int n){
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        allDivisors(10);
    }
}
