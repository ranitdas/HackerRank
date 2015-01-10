package warmup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ranitd
 * Date: 20/12/14
 * Time: 10:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindDigits {

    public static int findSolution (long num) {
        long finalNum = num, digit;
        int count = 0;

        while(finalNum > 0) {
            digit = finalNum % 10;
            if (digit != 0 && num % digit == 0)
                count++;
            finalNum /= 10;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int noTest;
        noTest = in.nextInt();

        for (int i = 0; i < noTest; i++) {
            long num = in.nextLong();
            System.out.println(findSolution(num));
        }
    }
}
