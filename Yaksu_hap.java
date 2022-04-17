import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Yaksu_hap {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i=1; i<=num; i++){
            if(num % i ==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        
    }
}
