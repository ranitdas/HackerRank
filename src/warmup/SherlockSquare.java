package warmup;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ranitd
 * Time: 02-01-2015
 * Project: HackerRank
 */
public class SherlockSquare {
    public static int checkSqrt(String rng) {
        String[] frmtimp = rng.split(" ");

        int f1;
        int f2;
        int s = 1;
        double sqt;
        int cnt = 0;
        f1 = Integer.parseInt(frmtimp[0]);
        f2 = Integer.parseInt(frmtimp[1]);
        sqt = Math.pow(s,2);

        while (sqt <= f2) {
            if (sqt >= f1 && sqt <= f2) {
                cnt++;
            }
            s++;
            sqt = Math.pow(s, 2);
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noCases;
        noCases = in.nextInt();

        for (int i = 0; i < noCases; i++) {
            Scanner scan = new Scanner(System.in);
            String inp = scan.nextLine();
            System.out.println(checkSqrt(inp));
        }
    }
}
