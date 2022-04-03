import java.util.Scanner;

public class Beak_2744 {
    public static void main(String[] args) {    //대문자는 소문자로, 소문자는 대문자로 출력하는 코드
        Scanner eng = new Scanner(System.in);
        String size = eng.next();

        char[] change = new char[size.length()];



        for(int i=0; i<size.length(); i++){
            change[i] = size.charAt(i);

            if(change[i]>=65 && change[i] <97) change[i]+=32;

            else change[i]-=32;


            System.out.print(change[i]);
        }

    }
}
