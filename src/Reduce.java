public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        boolean divisibleBy2 = n % 2 == 0;
        while (n > 0) {

            if (divisibleBy2) {
                n /= 2;
                steps += 1;
            }
            else {
                n -= 1;
                steps += 1;
            }
        }
        System.out.println(steps);

    }
}
