public class task1 {

    static boolean primeNumber(Integer number){

        boolean checkComposite = number % 5 != 0 && number % 3 != 0;
        boolean checkPrime = number >= 2 && number % 2 != 0;

        if (checkPrime && checkComposite || number == 2 || number == 3 || number == 5){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(primeNumber(1000000007));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));

    }
}