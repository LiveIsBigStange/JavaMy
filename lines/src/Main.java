import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //s.length()
        //s.charAt(index) - find the symbol of string
        //s.equals("") - s == ""
        //s.toUpperCase(), s.toLowerCase()
        //char ch = 'a';
        //(int)'2' = 50 by ASCII
        //(char)60 = 'a' by ASCII
        //(char)8 = backspace by ASCII

        //1
        boolean pass = false;
        for (int i = 0; i < s.length(); i++){
            pass = (s.charAt(i) >= (int)'a' && s.charAt(i) <= (int)'z')
                    || (s.charAt(i) >= (int)'A' && s.charAt(i) <= (int)'Z')
                    || (s.charAt(i) >= (int)'0' && s.charAt(i) <= (int)'9');
        }
        System.out.print(pass);
    }
}