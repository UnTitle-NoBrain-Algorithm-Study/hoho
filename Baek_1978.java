import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// N개의 수를 주고, 그 만큼의 수를 입력하면 그 중 소수의 개수를 뱉어냄
public class Baek_1978 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());

        boolean[] answer = new boolean[1001];
        answer[0] = answer[1] = true;

        for(int i=2; i*i <= 1000; i++){
            for(int j=i*i; j<=1000; j+=i){
                answer[j] = true;
            }
        }
        int count = 0;
        String[] num2 = br.readLine().split(" ");
        for(int i=0; i<num2.length; i++){
            if( answer[Integer.parseInt(num2[i])] ==false){
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
