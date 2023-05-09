    import java.util.Scanner;

    public class PrimeNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your number");
            int num = sc.nextInt();
            boolean isPrime = true;

            if (num == 1 || num ==0) {
                //worst case.
                System.out.println("invalid input");
            } else {

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        isPrime = false;

                    }
                }
                if (isPrime) {
                    System.out.println("no is prime");
                } else {
                    System.out.println("No is not prime");
                }

            }
        }
    }