import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter temperature in centigrade");
        double t = c.nextDouble();
        double n = (t - 32) / 1.8;
        System.out.println("temperature in celcius " + n);



    }
}
