

public class numberprime {
    private static boolean primeNumber(int number) {
        for (int i = 2; i <= number; i++) {
            if (number%i == 0 & i != number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(5));


    }
    }


