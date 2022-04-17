//두 배열을 만들고 곱해서 더했을 때, 최소가 되는 수
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Baek_1026 {
    public static void main(String[] args) {
        int num =0;
        Scanner in = new Scanner(System.in);
        num=in.nextInt();


        int[] a = new int[num];
        Integer[] b = new Integer[num];


        for(int i=0; i<num; i++){
            a[i] = in.nextInt();
        }
        for(int i=0; i<num; i++){
            b[i] = in.nextInt();
        }
        Integer[] storage = b;

        Arrays.sort(a);
        Arrays.sort(storage, Collections.reverseOrder());

        int sum=0;
        for (int i=0; i<num; i++){
            sum+=a[i]*storage[i];
        }
        System.out.println(sum);

    }
}
