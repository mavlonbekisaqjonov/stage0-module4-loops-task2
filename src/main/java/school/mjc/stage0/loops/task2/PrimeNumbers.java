package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 0;
        while (counter <= printToInclusive) {
            if (isPrime(counter)) {
                System.out.println(counter);
            }
            counter++;
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false; // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        return true; // It's prime
    }
}
