import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value");
        int n = s.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (1.0 / i);
        }
        System.out.println("series is " + sum);



    }
}
