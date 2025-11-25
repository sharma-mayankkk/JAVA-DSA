package BasicMaths;
import java.util.*;

public class basic_03 {
    public static void digitExtract(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        digitExtract(646546);
    }
}
