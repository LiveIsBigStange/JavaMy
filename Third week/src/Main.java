//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        // CYCLES for(body){condition}
//        for(int i = 0; i < 5; i++){
//            System.out.println(i);
//        }


        //1
//        int n = scanner.nextInt();
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i + " * " + n + " = " +  i * n);
//        }

        //2
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        for(int i = a; i <= b; i++){
//            System.out.print(i + " ");
//        }

        //3
//        int n = scanner.nextInt();
//        int counter = 10;
//        for(int i = 1; i < n; i++){
//            counter *= 10;
//        }
//
//        for(int i = counter; i >= counter / 10 ; i--){
//            System.out.print(i + " ");
//        }


        //4
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int sum = 0;
//        for(int i = a; i <= b; i++){
//            sum += i * i;
//        }
//        System.out.println(sum);
        //5
//        int n = scanner.nextInt();
//        int times = 1;
//        for(int i = 1; i <= n; i++){
//            times *= i;
//        }
//        System.out.println(times);

        //6
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++){
//            sum += i * (i + 1);
//        }
//        System.out.println(sum);

        //7
//        int n = scanner.nextInt();
//        for(int i = 0; i <= n; i++){
//            if(i % 2 != 0){
//                System.out.print(-i + " ");
//            }else{
//                System.out.print(i + " ");
//            }
//       }


        //8
//        int n = scanner.nextInt();
//        for (int i = 1; i <= n; i++) {
//            long result = 1;
//            for (int j = 1; j <= i; j++) {
//                result *= i;
//            }
//            System.out.print(result + " ");
//        }

        //test
//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j < 5; j++){
//                System.out.print(i + ":" + j + " ");
//            }
//            System.out.println();
//        }

        //9
//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //10
//        for(int i = 0; i < 5; i++){
//            for(int j = 0; i + j <= 4; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //11
//        for(int i = 0; i < 5; i++){
//            if(i == 0){
//                System.out.print(" ");
//            } else if (i == 1) {
//                System.out.print("  ");
//            }else if (i == 2) {
//                System.out.print("   ");
//            }else if (i == 3) {
//                System.out.print("    ");
//            }else {
//                System.out.print("     ");
//            }
//            for(int j = 0; i + j <= 4; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //12
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //CYCLES while(body){condition}
        //1
//        int x = scanner.nextInt();
//        int i = 0;
//        while(i <= 100){
//            System.out.print(i + " ");
//            i += x;
//        }
        //2
//        int x = scanner.nextInt();
//        int i = 0;
//        int sum = 0;
//        while (i <= x){
//            sum += i;
//            i++;
//        }
//        System.out.print("sum=" + sum);

        //3
//        int x = scanner.nextInt();
//        int counter = 0;
//        while (x > 0){
//            counter += 1;
//            x /= 10;
//        }
//        System.out.print("count=" + counter);

        //4
//        int x = scanner.nextInt();
//        int i = 0;
//        int sum = 0;
//        while (x != 0){
//            sum += x % 10;
//            x /= 10;
//        }
//        System.out.print("sum = " + sum);
        //5
//        int x = scanner.nextInt();
//        int x1 = x;
//        int max = 0;
//        int min = 9;
//        while (x != 0){
//            if (x % 10 > max) {
//                max = x % 10;
//            }
//            x /= 10;
//        }
//        while (x1 != 0){
//            if (x1 % 10 <= min) {
//                min = x1 % 10;
//            }
//            x1 /= 10;
//        }
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);
    }
}