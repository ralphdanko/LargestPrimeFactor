package net.projecteuler.problem3;

public class LargestPrimeFactor {
    private long number;
    private long factor = 0;
    private long largestPrimeFactor = 0;

    public LargestPrimeFactor() {}

    public LargestPrimeFactor(long number) {
        this.number = number;
    }

    public boolean isPrimeNumber(long factor) {
        if (factor < 2) {
            return false;
        }
        for (long j = 2; j*j <= factor; j++) {
            if (factor % j == 0) {
                return false;
            }
            break;
        }
        return true;
    }


    public void findLargestPrimeFactor() {
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                factor = i;
                if (isPrimeNumber(factor)) {
                    if (i > largestPrimeFactor) {
                        largestPrimeFactor = i;
                    }
                }

            }
        }
        System.out.println(largestPrimeFactor);
    }
}
