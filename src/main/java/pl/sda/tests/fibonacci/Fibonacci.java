package pl.sda.tests.fibonacci;

public class Fibonacci {

    public long compute(int n) {
        if (n <= 1) {
            return n;
        } else {
            return compute(n - 1) + compute(n - 2);
        }
    }

}
