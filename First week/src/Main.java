import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt(); // = присвоение
        int sum = x + y;
        System.out.println("sum = " + sum);
        System.out.println("sum = " + x + y);
        System.out.println(x + y + "sum = ");
        System.out.println(sum);
        System.out.println(x);
        System.out.println(y);
    }
}