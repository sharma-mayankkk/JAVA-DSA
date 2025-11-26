package BasicMaths;

//Check if the number is palindrome or not:
public class basic_04 {
    public static boolean isPalindrome(int n){
        int number = n;
        int reverse = 0;
        while(n>0){
            int lastDigit = n%10;
            reverse =(reverse*10)+lastDigit;
            n=n/10;
        }
        return number == reverse;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(123454321));
    }
}
