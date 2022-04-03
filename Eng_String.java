import java.util.ArrayList;
import java.util.Scanner;

public class Eng_String {
    public static void main(String[] args) {        //숫자와+문자열의 조합을 보고 숫자를 출력해주기 one23fou ->1234

        ArrayList<String>number = new ArrayList<String>();
        Scanner put = new Scanner(System.in);
        String change_Num = "";
        String put_Num;

        number.add("zero");
        number.add("one");
        number.add("two");
        number.add("three");
        number.add("four");
        number.add("five");
        number.add("six");
        number.add("seven");
        number.add("eight");
        number.add("nine");

        put_Num = put.next();

        if (put_Num.contains(number.get(0)))   {
            change_Num = put_Num.replace("zero","0");
        }

        for(int i=1; i<number.size(); i++){

            if(change_Num.contains(number.get(i)))
            {
                String ii = Integer.toString(i);
                change_Num = change_Num.replace(number.get(i),ii);
            }
        }

        System.out.println(change_Num);



    }
}
