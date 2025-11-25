package BasicMaths;

public class basic_00 {

    public static void main(String[] args) {
        //print sum of n natural numbers:
        int n = 5;
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
