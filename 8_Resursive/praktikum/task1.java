import java.util.Scanner;
//prime without recursive
public class task1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input : ");
        int n = scanner.nextInt();

        int[] prime = {2,3,5,7,11,13,17,19,23,29};

        System.out.println(prime[n-1]);
    }
}
