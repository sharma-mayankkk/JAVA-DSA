package BasicMaths;

//CONVERT BINARY TO DECIMAL:
public class basic_09 {

    public static void binaryToDecimal(int n){
        int power =0;
        int decimalNum = 0;

        while(n>0){
            int lastDigit = n%10;
            decimalNum += (int) (lastDigit * Math.pow(2,power));
            power++;
            n /=10;
        }
        System.out.println(decimalNum);
    }
    public static void main(String[] args) {
        binaryToDecimal(110011);
    }
}
