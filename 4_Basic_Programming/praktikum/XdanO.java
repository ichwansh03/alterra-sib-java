import java.util.Scanner;

public class XoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int letX = 0, letO = 0;

        System.out.print("Input = ");
        input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++){
            char letters = input.charAt(i);

            if (letters == 'x'){
                letX++;
            } else if (letters == 'o'){
                letO++;
            }
        }

        if (letX == letO){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}