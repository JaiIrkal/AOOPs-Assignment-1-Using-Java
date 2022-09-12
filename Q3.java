/*
 * AOOPs Q3
 * Read a line of text and search for substring "sdmcet" case insensitive.
 * If found then print success messsage else throw exception 
 * SubStringNotFoundException with message.
 */

import java.util.*;

class SubStringNotFoundException extends Exception {

    SubStringNotFoundException(String s) {

        super(s);
    }
}

public class Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        String finalString = inputString.toLowerCase();

        try {

            if (finalString.indexOf("sdmcet") == -1) {

                throw new SubStringNotFoundException("");
            } else {

                System.out.println("Substring Found!");
            }

        } catch (SubStringNotFoundException e) {

            System.out.println("Substring not found");
        }
    }
}
