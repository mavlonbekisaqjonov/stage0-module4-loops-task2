package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;
        long factorial = 1;
        while (number <= printToInclusive) {
            System.out.println(factorial);
            number++;
            if (number > 0) {
                factorial *= number;
            }
        }
    }
}
