import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Baek_2751 {
    public static void main(String[] args) {
        Scanner put1 = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); //원소 하나씩 출력시 시간 초과 발생-> 한번에 출력

        int s = put1.nextInt();
        ArrayList<Integer>result = new ArrayList<Integer>();

        for (int i=0; i<s; i++){
            result.add(put1.nextInt());
        }

        Collections.sort(result);
        for (int i : result){
            sb.append(i).append('\n');
        }
        System.out.println(sb);
    }
}
