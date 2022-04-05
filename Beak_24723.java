import java.util.Scanner;
//녹색 거탑,,,?
public class Beak_24723 {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);

        int number = put.nextInt();
        double result;

        switch (number){
            case 1:
                result = Math.pow(2,1);
                System.out.println((int)result);
                break;
            case 2:
                result = Math.pow(2,2);
                System.out.println((int)result);
                break;
            case 3:
                result = Math.pow(2,3);
                System.out.println((int)result);
                break;
            case 4:
                result = Math.pow(2,4);
                System.out.println((int)result);
                break;
            case 5:
                result = Math.pow(2,5);
                System.out.println((int)result);
                break;
        }

    }
}
