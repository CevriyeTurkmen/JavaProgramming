package week09_11_05_2022;

public class PrimeNumber {
    public static void main(String[] args) {

        boolean result = isPrime(13);
        System.out.println(result);
    }

    private static boolean isPrime(int number) {
        boolean isPrimeNumber = true;
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }


}
