import java.util.ArrayList;
import java.util.Scanner;

public class Baek_2754 {    //학점 계산하는 코드

    public static void main(String[] args) {

        ArrayList<String> grade = new ArrayList<String>();
        float out = 0.0f;
        Scanner put = new Scanner(System.in);

        grade.add(put.next());

        if(grade.get(0).contains("A")) out += 4.0;
        else if (grade.get(0).contains("B"))out += 3.0;
        else if (grade.get(0).contains("C"))out += 2.0;
        else if (grade.get(0).contains("D"))out += 1.0;


        if (grade.get(0).contains("+")) out += 0.3;
        else if (grade.get(0).contains("-")) out -= 0.3;

        System.out.println(out);

    }


}
