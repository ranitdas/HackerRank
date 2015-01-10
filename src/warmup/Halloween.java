package warmup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ranitd
 * Time: 10-01-2015
 * Project: HackerRank
 */
public class Halloween {
    public static long calcPcs(long no) {
        long a1, a2, pcs;
        a1 = no / 2;
        a2 = (no + 1) / 2;

        if (no % 2 == 0) {
            pcs = (long) Math.pow(no / 2, 2);
        } else {
            pcs = a1 * a2;
        }
        return pcs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfCases;
        noOfCases = in.nextInt();

        for (int i = 0; i < noOfCases; i++) {
            long pcs = in.nextLong();
            System.out.println(calcPcs(pcs));
        }
    }
}
