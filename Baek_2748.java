//피보나치 수열
import java.util.Scanner;
public class Baek_2748 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        long a =0;
        long b= 1;
        long sum =0;

        if(num == 0) System.out.println(a);
        else if (num == 1) System.out.println(b);

        if(num>=2 && num <=90){
            for(int i=2; i<=num; i++){
                sum = a+b;
                a=b;
                b=sum;
            }
            System.out.println(sum);
        }
    }
}
