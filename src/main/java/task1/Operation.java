package task1;

public class Operation {
    public static void main(String[] args) {
        int rangeStart = 2;
        int rangeEnd = 100;

        System.out.println("Prime numbers between " + rangeStart + " and " + rangeEnd + ":");

        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
