package warmup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ranitd
 * Time: 05-01-2015
 * Project: HackerRank
 */
public class AlternateChar {
    public static int CalcChar(String str) {
        int strCnt = str.length(), strOcr = 0;
        for (int i = 1; i < strCnt; i++) {
            char prevChar = str.charAt(i-1);
            char nextChar = str.charAt(i);
            if (prevChar == nextChar)
                strOcr++;
        }
        return strOcr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfCase;
        noOfCase = in.nextInt();

        for (int i = 0; i < noOfCase; i++) {
            String str = in.next();
            System.out.println(CalcChar(str));
        }
    }
}
