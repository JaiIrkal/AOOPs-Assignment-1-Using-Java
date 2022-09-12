
/*
 * USN: 2SD20CS043
 * Author: Jai Irkal
 * Q2.] Write a Java program to read an integer and check if numbher is prime 
 * or not. If negative number is entered then throw 
 * NegativeNumberNotAllowedException and if number is not prime then throw
 *  NumberNotPrimeException.
*/
import java.util.*;

class NegativeNumberNotAllowedException extends Exception {

    public NegativeNumberNotAllowedException(String s) {

        super(s);
    }
}

class NumberNotPrimeException extends Exception {

    public NumberNotPrimeException(String s) {

        super(s);
    }
}

class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        try {

            if (num < 0)
                throw new NegativeNumberNotAllowedException("Negative");
        } catch (NegativeNumberNotAllowedException e) {
            System.out.println("Negative");
        }

        if (!isPrime(num) & num == 1) {

            try {

                throw new NumberNotPrimeException("Not Prime");
            } catch (NumberNotPrimeException e) {

                System.out.println("Not prime");
            }
        } else {

            System.out.println(num + " is prime");
        }

    }

    static boolean isPrime(int num) {

        if (num <= 1) {

            return false;
        }

        else if (num == 2) {

            return true;
        }

        else if (num % 2 == 0) {

            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {

                return false;
            }
        }
        return true;
    }
}