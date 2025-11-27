package BasicMaths;
//Armstrong Number for 3 digit:
public class basic_06 {
    public static void armstrongNumber(int n){
        int number = n;
        int sum = 0;
        while(n>0){
           int lastDigit = n%10;
           sum+=(lastDigit*lastDigit*lastDigit);
           n = n/10;
        }
        if(number==sum){
            System.out.println("The number is Armstrong Number.)");
        }else System.out.println("Number is not Not armstrong Number.");
    }
    public static void main(String[] args) {
        armstrongNumber(371);
    }
}
