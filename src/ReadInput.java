import java.util.Scanner;

public class ReadInput {

    public static String read(){

        System.out.println("Please input expression: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }
}
