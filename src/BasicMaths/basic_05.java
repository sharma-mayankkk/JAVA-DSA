package BasicMaths;
//FIND GREATEST COMMON DIVISOR OF TWO NUMBERS:
public class basic_05 {

    //BRUTEFORCE METHOD BUT OPTIMIZED ONE:
    public static void greatestCommonDivisor(int num1, int num2){
        int count =0;
        for(int i=Math.min(num1,num2); i>1; i--){
            if(num1%i ==0 || num2%i ==0){
                System.out.println(i);
                count++;
                break;
            }
        }
        System.out.println(count);
    }

    //EQUILATERAL ALGORITHM TO FIND GCD:
    public static int equilateralGCD(int num1, int num2){
        while(num1>0 && num2>0){
            if(num1>num2){
                num1 = num1%num2;
            }else num2 = num2%num1;
        }
        if(num1 == 0) return num2;
        return num1;
    }
    public static void main(String[] args) {
        System.out.println(equilateralGCD(90,60));
    }
}
