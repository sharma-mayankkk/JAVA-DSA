package BasicMaths;

//Convert decimal to binary number:
public class basic_10 {
    public static void decimalToBinary(int n){
        int power =0;
        int binary = 0;

        while(n>0){
            int remainder = n%2;
            binary+= (int) (remainder* Math.pow(10,power));
            power++;
            n/=2;
        }

        System.out.println(binary);
    }
    public static void main(String[] args) {
        decimalToBinary(18);
    }
}
