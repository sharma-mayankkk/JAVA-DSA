package BasicMaths;

public class basic_01 {
    //PRINT REVERSE OF A NUMBER:

    // Without changing the actual number:
    public static void reverseNumber(int n) {
        while(n>0) {
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
    }

    //changing the actual value of the number:
    public static void reverseNumber2(int n){
        int reverse = 0;
        while(n>0){
            int lastDigit = n%10;
            reverse = (reverse*10)+lastDigit;
            n = n/10;
        }
        n = reverse;
        System.out.println(n);
    }

    public static void main(String[] args) {
        reverseNumber2(38455);
    }
}
