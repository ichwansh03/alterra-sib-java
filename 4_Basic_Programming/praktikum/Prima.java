import java.util.Scanner;

public class PrimeOn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input : ");
        int value = scanner.nextInt();

        if (value == 2 || value > 2 && value % 2 != 0){
            System.out.println("Bilangan prima");
        } else {
            System.out.println("Bukan bilangan prima");
        }

    }
}
