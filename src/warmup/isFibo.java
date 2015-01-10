package warmup;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ranitd
 * Time: 01-01-2015
 * Project: HackerRank
 */
public class isFibo {
    public static String checkFibo(long num) {
        long c;
        String stat;
        ArrayList<Long> fbarr = new ArrayList<Long>();
        fbarr.add(Long.valueOf(0));
        fbarr.add(Long.valueOf(1));
        int arrsize = fbarr.size() - 1;

        while (fbarr.get(arrsize) < num) {
            c = fbarr.get(arrsize - 1) + fbarr.get(arrsize);
            fbarr.add(c);
            arrsize = fbarr.size() - 1;
        }

        if (fbarr.contains(num))
            stat = "IsFibo";
        else
            stat = "IsNotFibo";

        return stat;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfTest;
        noOfTest = in.nextInt();

        for (int i = 0; i < noOfTest; i++) {
            long num = in.nextLong();
            System.out.println(checkFibo(num));
        }
    }
}
